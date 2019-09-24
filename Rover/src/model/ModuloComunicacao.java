package model;
import java.util.Observable;
import java.util.Observer;

public class ModuloComunicacao extends Observable implements Observer{
	  private String mensagem;
	  private String mensagemRecebida;
	    private int gastoEnergetico=5;
	    private Antena antena;
	    private int canal;
	    
	    public ModuloComunicacao() {
	        antena=new Antena();
	        
	    }
	    public String codificaMensagem(String mensagem) {
	         StringBuilder s = new StringBuilder();
	         
       	if(antena.isOperacional()) {
        		for(int i=0;i<mensagem.length();i++) {
        			char msg=mensagem.charAt(i);
        			msg+=10;
        			s.append(msg);
        		
        	
       		}
        	}
        	
	        return s.toString();
        	
	    }
	    public String decodificaMensagem(String mensagem) {
	    	  StringBuilder s2 = new StringBuilder();
	    	  if(antena.isOperacional()) {
	        	for(int i=0;i<mensagem.length();i++) {
	        		char msg2=mensagem.charAt(i);
	        		msg2-=10;
	        		s2.append(msg2);
	        	}
	    	  }
	    	  
	        return s2.toString();
	        
	    }
	    public void transmiteMensagem(String mensagem) {
	    	if(antena.isOperacional()) {
	    	antena.transmiteOndaDeRadio(mensagem);
	        EspacoSideral.getInstancia().setSinais(canal, mensagem);
	    	}
	    	
	    }
	    
	    
	    public void recebeMensagem(String mensagem) {
	    	if(antena.isOperacional()) {
	    	mensagem= antena.getMensagem();
	    	}
	    }
	    @Override
	    public void update(Observable o,Object arg) {
	        
	      mensagemRecebida=this.antena.getMensagem();
	        this.setMensagem(mensagemRecebida);
	        
	    }
	    public void notifica() {
	    	setChanged();
	    	notifyObservers();
	    }
	    
	    public String getMensagem() {
	        return mensagem;
	    }
	    private void setMensagem(String mensagem) {
	        this.mensagem = mensagem;
	        this.notifica();
	    }
	    public int getGastoEnergetico() {
	        return gastoEnergetico;
	    }
	    public void setGastoEnergetico(int gastoEnergetico) {
	        this.gastoEnergetico = gastoEnergetico;
	    }
	    public Antena getAntena() {
	        return antena;
	    }
	    public void setAntena(Antena antena) {
	        this.antena = antena;
	    }
	    public int getCanal() {
	        return canal;
	    }
	    public void setCanal(int canal) {
	        this.canal = canal;
	    }
}
   
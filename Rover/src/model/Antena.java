package model;
import java.util.Observable;
import java.util.Observer;

public class Antena extends Observable implements Observer {
	
		private int receptor;
		private int transmissor;
        private String mensagem;
        private boolean operacional=true;
        private int gastoEnergetico=5;
        private int canal;
		
        public Antena(){
        	this.canal=canal;
		}
		public void transmiteOndaDeRadio(String mensagem) {
		 StringBuilder s = new StringBuilder();

	       if(operacional) {

	            for(int i=0;i < mensagem.length();i++){

	                int letra = mensagem.charAt(i);

	                s.append(Integer.toBinaryString(letra));

	            }

	            this.setMensagem(s.toString());
                
	       }
	  
	    	 
	     }
		public void recebeOndasDeRadio() {
		   
	    	}
		
		public void notifica() {
			setChanged();
			notifyObservers();
		}
		
		public Antena(int receptor, int transmissor){
			this.receptor = receptor;
			this.transmissor = transmissor;
		}

		public int getReceptor(){
			return receptor;
		}
		public int getTransmissor(){
			return transmissor;
		}
		public void setReceptor(int receptor){
			this.receptor = receptor;
		}
		public void setTrasmissor(int transmissor){
			this.transmissor = transmissor;
		}
		public String getMensagem() {
			return mensagem;
		}
		private void setMensagem(String mensagem) {
			this.mensagem = mensagem;
			this.notifica();
		}
		public boolean isOperacional() {
			return operacional;
		}
		public void setOperacional(boolean operacional) {
			this.operacional = operacional;
		}
		@Override
		public void update(Observable arg0, Object arg1) {
			
			
			String mensagemRecebida=EspacoSideral.getInstancia().getSinais(canal);
			this.setMensagem(mensagemRecebida);
			
			
			
		}
		public int getGastoEnergetico() {
			return gastoEnergetico;
		}
		public void setGastoEnergetico(int gastoEnergetico) {
			this.gastoEnergetico = gastoEnergetico;
		}
		


}

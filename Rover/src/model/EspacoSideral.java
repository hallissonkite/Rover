package model;
import java.util.HashMap;
import java.util.Observable;

public class EspacoSideral extends Observable{
	private static HashMap<Integer,String> sinais;
	private static EspacoSideral instancia;
	
	
	
	
	private EspacoSideral() {
		
		super();
		sinais= new HashMap<>();
		
	}
	
	 public void notifica() {
	    	setChanged();
	    	notifyObservers();
	    }
	
	public static EspacoSideral getInstancia() {
		if(instancia==null) {
			instancia= new EspacoSideral();
		}
		return instancia;
	}
	public static void setInstancia(EspacoSideral instancia) {
		EspacoSideral.instancia = instancia;
	}
	public  String getSinais(int canal) {
		return sinais.get(canal);
	}
	public  void setSinais(int canal,String sinal) {
		sinais.put(canal, sinal);
		this.notifica();
	}
	
}

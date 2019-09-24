package controler;


import model.Rover;
import view.TelaCodificaMensagem;

public class ControleTelaCodificaMensagem {

	private Rover rover;
	private TelaCodificaMensagem telaCodificaMensagem;
	
	public ControleTelaCodificaMensagem(Rover rover,TelaCodificaMensagem telaCodificaMensagem) {
		this.rover=rover;
		this.telaCodificaMensagem=telaCodificaMensagem;
	
		
	}
	
	public void codificando(String mensagem) {
	
		mensagem=rover.getModuloComunicacao().codificaMensagem(mensagem);
		telaCodificaMensagem.printandoMensagem(mensagem);
	}
	
	
	
	
	
}

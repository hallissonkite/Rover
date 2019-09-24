package view;

import java.util.Scanner;

import controler.ControleTelaCodificaMensagem;

import model.Rover;

public class TelaCodificaMensagem {
	
	private Rover rover;
	private ControleTelaCodificaMensagem controleTelaCodificaMensagem;
	private String mensagem;
	
	public  TelaCodificaMensagem(Rover rover) {
		controleTelaCodificaMensagem= new ControleTelaCodificaMensagem(rover, this);
		this.rover=rover;
		mensagemCodificada();
	}
	public void mensagemCodificada() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("digite sua mensagem");
		this.setMensagem(sc1.nextLine());
		controleTelaCodificaMensagem.codificando(mensagem);
		
		
	}
	public void printandoMensagem(String mensagem) {
		System.out.println(mensagem);
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public ControleTelaCodificaMensagem getControleTelaCodificaMensagem() {
		return controleTelaCodificaMensagem;
	}

	public void setControleTelaCodificaMensagem(ControleTelaCodificaMensagem controleTelaCodificaMensagem) {
		this.controleTelaCodificaMensagem = controleTelaCodificaMensagem;
	}

	
}

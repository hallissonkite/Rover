package view;
import controler.ControleDecodificaMensagem;


import model.Rover;
import java.util.Scanner;
	public class TelaDecodificaMensagem {
	
		
		private Rover rover;
		private ControleDecodificaMensagem controleDecodificaMensagem;
		private String mensagem;
		
		
		public  TelaDecodificaMensagem(Rover rover) {
			controleDecodificaMensagem=new ControleDecodificaMensagem(rover, this);
			
			this.rover=rover;
			mensagemDecodificada();
		}
		public void mensagemDecodificada() {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("digite sua mensagem");
			this.setMensagem(sc1.nextLine());
			controleDecodificaMensagem.decodificando(mensagem);
			
			
		}
		
		private void setMensagem(String mensagem) {
			this.mensagem=mensagem;
			
		}
		public void printandoMensagem(String mensagem) {
			System.out.println(mensagem);
			
		}
	}



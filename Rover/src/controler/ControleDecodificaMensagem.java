package controler;

import model.Rover;

import view.TelaDecodificaMensagem;
public class ControleDecodificaMensagem {

		private Rover rover;
		private TelaDecodificaMensagem telaDecodificaMensagem;
		
		public ControleDecodificaMensagem(Rover rover,TelaDecodificaMensagem telaDecodificaMensagem) {
			this.rover=rover;
			this.telaDecodificaMensagem=telaDecodificaMensagem;
		
			
		}
		
		public void decodificando(String mensagem) {
		
			mensagem=rover.getModuloComunicacao().decodificaMensagem(mensagem);
			telaDecodificaMensagem.printandoMensagem(mensagem);
		}
		
	}


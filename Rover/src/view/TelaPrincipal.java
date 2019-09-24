package view;

    
	import java.util.Scanner;


import controler.ControleTelaPrincipal;
import model.Coordenadas;
import model.Rover;
	
	public class TelaPrincipal{
		private Rover rover;
		private ControleTelaPrincipal ctp;
		private String nomeRover;
		private int cargaAtual;
		
		private  ControleTelaPrincipal  ControleTelaPrincipal;
		public TelaPrincipal(Rover rover ) {
			this.setRover(rover);
			this.setCtp(new ControleTelaPrincipal(rover,this));
			show();
		}
		public void show() {
			Scanner sc1 = new Scanner(System.in);
			int opcao;
			
			System.out.println("     MENU PRINCIPAL");
			System.out.println("++++++++++++++++++++++++++++++");
			System.out.println("[1]- CRIAR ROVER");
			System.out.println("[2]- LOCALIZAR ROVER");
			System.out.println("[3]- CONFIGURACOES ROVER");
			System.out.println("[4]- MOVIMENTAR ROVER");
			System.out.println("[5]- CODIFICAR MENSAGEM");
			System.out.println("[6]- DECODIFICAR MENSAGEM");
			System.out.println("[0]- SAIR");
			System.out.println("+++++++++++++++++++++++++++++++");
			System.out.println("Digite uma opcao:");
			opcao = sc1.nextInt();
			ctp.gerenciaTela(opcao);
		}
		public void auxilioControle() {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Digite o nome do Rover");
			setNomeRover(sc1.nextLine());
			System.out.println("digite a bateria");
			setCargaAtual(sc1.nextInt());
		}
		
		
		public void coordeLocal(Coordenadas coord) {
			System.out.println("["+coord.getCoodenadaX()+"]"+"["+coord.getCoordenadaY()+"]");
		}
		public void configRover(Rover rover) {
			
		}
		public String getNomeRover() {
			return nomeRover;
		}
		public void setNomeRover(String nomeRover) {
			this.nomeRover = nomeRover;
		}
		public int getCargaAtual() {
			return cargaAtual;
		}
		public void setCargaAtual(int cargaAtual) {
			this.cargaAtual = cargaAtual;
		}
		public ControleTelaPrincipal getCtp() {
			return ctp;
		}
		public void setCtp(ControleTelaPrincipal ctp) {
			this.ctp = ctp;
		}
		public Rover getRover() {
			return rover;
		}
		public void setRover(Rover rover) {
			this.rover = rover;
		}
		public void exibeMensagem(String mensagem) {
			System.out.println(mensagem);
		}
		
}

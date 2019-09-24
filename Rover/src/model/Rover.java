package model;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class Rover implements Observer {
	    
	    private char mapa[][]=new char[20][20];
		private String nome;
		private Bateria bateria;
		private Coordenadas coordenadas;
		private Antena antena;
		private DepositoAmostras depositoAmostras;
		private int gastoEnergetico;
		private BracoMecanico bracoMecanico;
		private ModuloComunicacao moduloComunicacao;
		private ModuloAnalises moduloAnalises;
		private Planeta planeta;
		private Substancia substancia;
		public int sr1;
		private Amostra amostra;
		private Rocha r;
		private int direcao;
		public Rover() {
			this.substancia = new Substancia();
			this.planeta = new Planeta("terra",0,0,20);
			this.planeta.iniciaRover(this);
			this.antena = new Antena();
			this.amostra = new Amostra();
		    this.depositoAmostras=new DepositoAmostras();
			 this.coordenadas = new Coordenadas();
			this.bateria= new Bateria();
			this.bracoMecanico= new BracoMecanico();
			 this.moduloComunicacao=new ModuloComunicacao();
			 
			  this.moduloAnalises=new ModuloAnalises(depositoAmostras);
			 this.r = new Rocha();
		}
		public Rover(String nome,Bateria bateria, Coordenadas coordenadas, Antena antena,DepositoAmostras depositoAmostras,Planeta planeta,ModuloComunicacao moduloComunicacao,
				ModuloAnalises moduloAnalises,BracoMecanico bracoMecanico){
			this.nome = nome;
			this.bateria = bateria;
			this.coordenadas = coordenadas; 
			this.antena = antena;
		    this.depositoAmostras=depositoAmostras;
			this.bracoMecanico=bracoMecanico;
			this.moduloComunicacao=moduloComunicacao;
			this.moduloAnalises=moduloAnalises;
			this.planeta=planeta;
			
		}

		public String getNome(){
			return nome;
		}
		public Bateria getBateria(){
			return bateria;
		}
		public Coordenadas getCoordenadas(){
			return coordenadas;
		}
		public Antena getAntena(){
			return antena;
		}
		public void setNome(String nome){
			this.nome = nome;
		}
		public void setBateria(Bateria bateria){
			this.bateria = bateria;
		}
		public void setCoordenadas(Coordenadas coordenadas){
			if(coordenadas != null ){
				if(coordenadas.getCoordenadaY() >= 0 && coordenadas.getCoodenadaX() >= 0 )
					this.coordenadas = coordenadas;
			}
		}
		public void setAntena(Antena antena){
			this.antena = antena;
		}

		public DepositoAmostras getDepositoAmostras() {
			return depositoAmostras;
		}

		public void setDepositoAmostras(DepositoAmostras depositoAmostras) {
			this.depositoAmostras = depositoAmostras;
		}

		public int getGastoEnergetico() {
			return gastoEnergetico;
		}

		public void setGastoEnergetico(int gastoEnergetico) {
			this.gastoEnergetico = gastoEnergetico;
		}

		public BracoMecanico getBracoMecanico() {
			return bracoMecanico;
		}

		public void setBracoMecanico(BracoMecanico bracoMecanico) {
			this.bracoMecanico = bracoMecanico;
		}

		public ModuloComunicacao getModuloComunicacao() {
			return moduloComunicacao;
		}

		public void setModuloComunicacao(ModuloComunicacao moduloComunicacao) {
			this.moduloComunicacao = moduloComunicacao;
		}

		public ModuloAnalises getModuloAnalises() {
			return moduloAnalises;
		}

		public void setModuloAnalises(ModuloAnalises moduloAnalises) {
			this.moduloAnalises = moduloAnalises;
		}

		public Planeta getPlaneta() {
			return planeta;
		}

		public void setPlaneta(Planeta planeta) {
			this.planeta = planeta;
		}
		
		public void moveFrente(Object object) {
			if (object != null)
			{
				 direcao= 1+ new Random().nextInt(3);

				if (object instanceof Rover) {
					Coordenadas coord=this.planeta.localizaObjeto(object);
					
					if(direcao==1) {
						if(coord.getCoodenadaX()>0) {
							planeta.getObjetos()[coord.getCoodenadaX()-1][coord.getCoordenadaY()].add(object);
							planeta.getObjetos()[coord.getCoodenadaX()][coord.getCoordenadaY()].remove(object);
						}else {

							planeta.getObjetos()[19][coord.getCoordenadaY()].add(object);
							planeta.getObjetos()[0][coord.getCoordenadaY()].remove(object);
							
						}
					}

					if(direcao==2) {

						if(coord.getCoodenadaX()<19) {

							planeta.getObjetos()[coord.getCoodenadaX()+1][coord.getCoordenadaY()].add(object);
							planeta.getObjetos()[coord.getCoodenadaX()][coord.getCoordenadaY()].remove(object);
							
						}else {
							planeta.getObjetos()[0][coord.getCoordenadaY()].add(object);
							planeta.getObjetos()[19][coord.getCoordenadaY()].remove(object);
						}
					}
					if(direcao==3) {
						if(coord.getCoordenadaY()<19) {

							planeta.getObjetos()[coord.getCoodenadaX()][coordenadas.getCoordenadaY()+1].add(object);
							planeta.getObjetos()[coord.getCoodenadaX()][coordenadas.getCoordenadaY()].remove(object);
							
						}else {

							planeta.getObjetos()[coord.getCoodenadaX()][0].add(object);
							planeta.getObjetos()[coord.getCoodenadaX()][19].remove(object);
							
						}
					}
					if(direcao==4) {
						if(coord.getCoordenadaY()>0) {
							planeta.getObjetos()[coord.getCoodenadaX()][coordenadas.getCoordenadaY()-1].add(object);
							planeta.getObjetos()[coord.getCoodenadaX()][coordenadas.getCoordenadaY()].remove(object);
							
						}else {

							planeta.getObjetos()[coord.getCoodenadaX()][19].add(object);
							planeta.getObjetos()[coord.getCoodenadaX()][0].remove(object);
							
						}

					}
				}
			}
			planeta.notificaObserver();
		}
		public void dobraDireita( ) {
			if(direcao==1) {
				direcao=3;
			}else
			if(direcao==2) {
				direcao=4;
			}else
			if(direcao==3) {
				direcao=2;
			}else
			if(direcao==4) {
					direcao=1;
				}
		}
		public void dobraEsquerda() {
			if(direcao==3) {
				direcao=1;
			}else
			if(direcao==4) {
				direcao=2;
			}else
			if(direcao==2) {
				direcao=3;
			}else
			if(direcao==1) {
					direcao=4;
				}
			
		}
			
		
		public void analiseArea() {
			Object a=null;
			for(int i=0;i<planeta.getObjetos().length;i++){
				if(planeta.getObjetos()[i] != null) {
					 a=planeta.getObjetos()[i];
					 if(a instanceof Bateria) {
						mapa[i][i]='B'; 
						a=new Bateria();
						int decisao=  1 + (int) (Math.random() * 2);
						switch(decisao) {
						case 1:
							try {
								this.bracoMecanico.pegaRocha(i);
							} catch (FalhaNoSistemaException e) {
								
								e.printStackTrace();
							}
							this.bateria.carregaBateria(((Bateria) a).getCarga());
							break;
						case 2:
							System.out.println("Nao se faz nescessario o uso agora,mais guardarei em meu mapa");
							break;
						}
					  }
					 if(a instanceof Rocha) {
						Amostra am=new Amostra();
						try {
							this.bracoMecanico.pegaRocha(i);
						} catch (FalhaNoSistemaException e) {
							
							e.printStackTrace();
						}
						 if(this.moduloAnalises.analisaAmostra(am)== true) {
							mapa[i][i]='A'; 
						 }
						 
					 }
					}
				}
			}
		public Rocha pegarRocha(int posicao) {
			Rocha r=new Rocha();
			this.getPlaneta().removeObjeto(this.bracoMecanico, posicao);
			this.bateria.descarregaBateria(this.bracoMecanico.getGastoEnergetico());
			return r ;
			
			
		}
		public Object pegarItem(int posicao) {
			return null;
		}
		public void executaComando(String comando) {
			this.moduloComunicacao.recebeMensagem(comando);
			this.bateria.descarregaBateria(this.moduloComunicacao.getGastoEnergetico());
			this.moduloComunicacao.decodificaMensagem(comando);
			this.bateria.descarregaBateria(this.moduloComunicacao.getGastoEnergetico());
		}
		public Amostra constroiAmostra(Rocha rocha) {
			rocha=new Rocha();
			this.moduloAnalises.analisaAmostra(amostra);
			this.bateria.descarregaBateria(this.moduloAnalises.getGastoEnergetico());
			return null;
		}
		public void guardaAmostra(Amostra amostra) {
			depositoAmostras.adicionaAmostra(amostra);
		}
		public void update(Observable arg0, Object arg1) {
			
		}
		public void ligaRover() {
			
		}
		public void desligaRover() {
			
		}
		public void transmiteMensagem(String mensagem) {
			moduloComunicacao.transmiteMensagem(mensagem);
			
		}
		
		
		@Override
		public String toString() {
		return "R";
		}

		public char[][] getMapa() {
			return mapa;
		}

		public void setMapa(char mapa[][]) {
			this.mapa = mapa;
		}
}

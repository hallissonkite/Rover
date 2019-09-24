package view;

import java.util.Scanner;

import controler.ControleTelaConfiguracoesRover;
import model.Rover;

public class TelaConfiguracoesRover {
     private  Rover rover;
     private ControleTelaConfiguracoesRover ctr;
     private int pesoMaximo;
     private int abertura;
     private int tamanho;
     public TelaConfiguracoesRover(Rover rover) {
    	 this.rover=rover;
    	 ctr= new ControleTelaConfiguracoesRover(rover,this);
    	 configuraRover();
     }
     public void configuraRover() {
    	 Scanner sc1 = new Scanner(System.in);
    	 System.out.println("Peso maximo suportado pelo braco mecanico");
		this.setPesoMaximo(sc1.nextInt());
		System.out.println("Abertura maxima de suas garras");
		this.setAbertura(sc1.nextInt());
		System.out.println("Tamanho do Deposito de Amostras do seu rover");
		this.setTamanho(sc1.nextInt());
		ctr.setDosValores();
     }
	public int getPesoMaximo() {
		return pesoMaximo;
	}
	public void setPesoMaximo(int pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}
	public int getAbertura() {
		return abertura;
	}
	public void setAbertura(int abertura) {
		this.abertura = abertura;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}

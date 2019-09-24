package view;

import controler.ControleMovimentacaoRover;
import model.Coordenadas;

import model.Rover;

public class TelaMovimentaRover {
	 private Rover rover;
	 
	 private  ControleMovimentacaoRover controlaMovimentacaoRover;
	 private int direcao;
	 private Coordenadas coordenada;
	 public TelaMovimentaRover(Rover rover) {
		 this.rover=rover;
		 controlaMovimentacaoRover=new ControleMovimentacaoRover(rover,  this);
		controlaMovimentacaoRover.movimentaRover();
		 
	 }

	public int getDirecao() {
		return direcao;
	}
}

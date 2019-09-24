package controler;

import model.Rover;
import view.TelaConfiguracoesRover;

public class ControleTelaConfiguracoesRover {
   private Rover rover;
   private TelaConfiguracoesRover tcr;
   
   public ControleTelaConfiguracoesRover(Rover rover, TelaConfiguracoesRover tcr) {
	   this.setRover(rover);
	   this.setTcr(tcr);
	   
   }
public void setDosValores() {
	rover.getBracoMecanico().setPesoMaximo(tcr.getPesoMaximo());
	rover.getBracoMecanico().setAberturaMaxima(tcr.getAbertura());
	rover.getDepositoAmostras().setTamanho(tcr.getTamanho());
}
public Rover getRover() {
	return rover;
}

public void setRover(Rover rover) {
	this.rover = rover;
}

public TelaConfiguracoesRover getTcr() {
	return tcr;
}

public void setTcr(TelaConfiguracoesRover tcr) {
	this.tcr = tcr;
}
   
   
}

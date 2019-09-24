package controler;

import model.Rover;
import view.TelaMovimentaRover;

public class ControleMovimentacaoRover {
    private Rover rover;
    private TelaMovimentaRover telaMovimentaRover;
    
   public ControleMovimentacaoRover(Rover rover,TelaMovimentaRover telaMovimentaRover) {  
	   this.rover=rover;
	   this.telaMovimentaRover=telaMovimentaRover;
   }
    
   public void movimentaRover() {
		 rover.moveFrente(rover);
		 
   }

}

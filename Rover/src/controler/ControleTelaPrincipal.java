package controler;

import model.Bateria;
import model.Coordenadas;
import model.ModuloComunicacao;
import model.Planeta;
import model.Rover;
import view.TelaCodificaMensagem;
import view.TelaConfiguracoesRover;
import view.TelaMovimentaRover;
import view.TelaPlaneta;
import view.TelaPrincipal;
import view.TelaDecodificaMensagem;

public class ControleTelaPrincipal {
    private Rover rover;
    private Planeta planeta;
    private TelaPrincipal telaPrincipal;
   
    private ModuloComunicacao moduloComunicacao;
    
     public ControleTelaPrincipal(Rover rover ,TelaPrincipal telaPrincipal) {
    	 this.rover=rover;
    	 this.telaPrincipal=telaPrincipal;
    	 
     }
     
     public void gerenciaTela(int opcao) {
    	 switch(opcao){
			case 1:
				telaPrincipal.auxilioControle();
				
				rover.getBateria().setCargaAtual(telaPrincipal.getCargaAtual());
				rover.setNome(telaPrincipal.getNomeRover());
				new TelaPlaneta(rover.getPlaneta());
				telaPrincipal.show();
				break;
			case 2:
				Coordenadas coord=rover.getPlaneta().localizaObjeto(rover);
				if(coord != null) {
					telaPrincipal.coordeLocal(coord);
				}else {
					telaPrincipal.exibeMensagem("Rover não encontrado");
				}
				telaPrincipal.show();
				break;
			case 3:
				new TelaConfiguracoesRover(rover);
				telaPrincipal.show();
				
				
				break;
			case 4:
				new TelaMovimentaRover(rover);
				new TelaPlaneta(rover.getPlaneta());
				telaPrincipal.show();
				
				break;	
			
			case 5:
				 new TelaCodificaMensagem( rover);
				 telaPrincipal.show();
					break;	
				
			
			case 6:
				new TelaDecodificaMensagem( rover);
				 telaPrincipal.show();
					break;	
				
		}
     }

	
     
     
     
}

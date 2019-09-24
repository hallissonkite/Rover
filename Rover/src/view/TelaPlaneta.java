package view;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import controler.ControleTelaPlaneta;
import model.Planeta;

public class TelaPlaneta implements Observer {
	private Planeta planeta;
    private ControleTelaPlaneta controlePlaneta;
    private ArrayList<Object>[][] objetos;
    
    public TelaPlaneta(Planeta planeta) {
    	this.planeta=planeta;
    	controlePlaneta= new ControleTelaPlaneta(planeta,this);
    	this.objetos=planeta.getObjetos();
    	exibirPlaneta();
    }
     
    public void  exibirPlaneta(){
		for(int i=0;i< 20;i++)
		{
			for(int j=0; j < 20; j++)
			{
				
					if(objetos[i][j] != null && objetos[i][j].isEmpty()) {
						System.out.print("|__|");
					}else
					System.out.print(" "+objetos[i][j]);
				
				
			}
			System.out.println();
		}
		
	
		}
    
	public Planeta getPlaneta() {
		return planeta;
	}

	public void setPlaneta(Planeta planeta) {
		this.planeta = planeta;
	}

	public ControleTelaPlaneta getControlePlaneta() {
		return controlePlaneta;
	}

	public void setControlePlaneta(ControleTelaPlaneta controlePlaneta) {
		this.controlePlaneta = controlePlaneta;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		this.objetos=planeta.getObjetos();
		
	}
}

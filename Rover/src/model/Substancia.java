package model;

public class Substancia {
	
	 	private String nome;
	    private String formula;
	    private int massa;
	    public Substancia(){
	        int tipo = 1 + (int) (Math.random() * 10);
	         massa= 1 + (int)(Math.random()*1000);
	        switch (tipo){
	            case 1: nome = "Acido Sulfurico";
	                    formula = "H2SO4";
	                    massa=this.getMassa();
	                    break;
	            case 2: nome = "Agua";
	                    formula = "H2O";
	                    massa=this.getMassa();
	                    break;
	            case 3: nome = "Sal de Cozinha";
	                    formula = "NaCl";
	                    massa=this.getMassa();
	                    break;
	            case 4:
	            		nome = "calcita";
	            		formula = "CaCO3";
	            		massa=this.getMassa();
                break;
	            case 5:
	            		nome = "Ouro";
	            		formula = " Au2O3";
	            		massa=this.getMassa();
                break;
	            case 6:
	            		nome = "Magnesita";
	            		formula = "MgCO3";
	            		massa=this.getMassa();
                break;
	            case 7:
	            		nome = "Cerusita";
	            		formula = "PbCO3";
	            		massa=this.getMassa();
                break;
	            case 8:
	            		nome = "Siderita";
	            		formula = "FeCO3";
	            		massa=this.getMassa();
                break;
	            case 9:
	            		nome = "Magnesio";
	            		formula = "MgO";
	            		massa=this.getMassa();
                break;
	            case 10:
	            		nome = "Quartzo";
	            		formula = "SiO2";
	            		massa=this.getMassa();
                break;
	        }        
	    }
	    
	    public String getFormula(){
	        return formula;
	    }
	    public String getNome()
	    {
	    	return nome;
	    }

		public int getMassa() {
			return massa;
		}

		public void setMassa(int massa) {
			this.massa = massa;
		}
		@Override
		public String toString() {
			
			return formula;
			
			
		}

}

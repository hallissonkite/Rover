package model;

public class Rocha {
      private Substancia[] substancias;
      private int diametro;
      private int massa;
      
  	public Rocha(){
  		int total = 1 + (int) (Math.random() * 10);
  		substancias= new Substancia[total];
  		for(int i=0; i<substancias.length; i++){
  			substancias[i] = new Substancia();
  		
  		}
  	}
  	
  	public Substancia[] getSubstancias(){
  		return substancias;
  	}

  	public Rocha pegarRocha(int posicao) {
		return null ;
		
		
	}
  	@Override
  	public String toString() {
  		return "r";
  	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public int getMassa() {
		return massa;
	}

	public void setMassa(int massa) {
		this.massa = massa;
	}
     
	
}

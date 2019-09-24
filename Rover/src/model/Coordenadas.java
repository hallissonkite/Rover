package model;

public class Coordenadas {

		private int coordenadaX =0;
		private int coordenadaY =0;
        private int quadrante;
        
		public Coordenadas(){

		}

		public Coordenadas(int coordenadaX,int coordenadaY){
			this.coordenadaX = coordenadaX;
			this.coordenadaY = coordenadaY;
		
			
			
		}
		public int verifQuadrante(int coordenadaX,int coordenadaY) {
			if(this.getCoodenadaX()>0 && this.getCoordenadaY()>0) {
				quadrante=1;
			}
			if(this.getCoodenadaX()<0 && this.getCoordenadaY()>0) {
				quadrante=2;
			}
			if(this.getCoodenadaX()>0 && this.getCoordenadaY()<0) {
				quadrante=4;
			}
			if(this.getCoodenadaX()<0 && this.getCoordenadaY()<0) {
				quadrante=3;
			}
			
			return quadrante;
			
		}
		public int getCoodenadaX(){
			return coordenadaX;
		}
		public int getCoordenadaY(){
			return coordenadaY;
		}
		
		public void setCoordenadaX(int coordenadaX){
			if(coordenadaX >=0)
				this.coordenadaX = coordenadaX;
		}
		public void setCoordenadaY(int coordenadaY){
			if(coordenadaY >=0)
				this.coordenadaY = coordenadaY;
		}
		

		public int getQuadrante() {
			return quadrante;
		}

		public void setQuadrante(int quadrante) {
			this.quadrante = quadrante;
		}
        
		
			
		}



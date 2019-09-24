package model;

public class Bateria {
	
		private int cargaMaxima = 100;
		private int cargaMinima = 25;
		private int cargaAtual = 0;
		private int carga;
		

		public Bateria(){
			this.setCarga(carga);
			this.setCargaMaxima(cargaMaxima);
			this.setCargaAtual(cargaAtual);
		}
		public Bateria(int cargaAtual){
			this.cargaAtual = cargaMaxima;
		}
		public int getCargaMaxima(){
			return cargaMaxima;
		}
		public int getCargaMinima(){
			return cargaMinima;
		}
		public int getCargaAtual(){
			return cargaAtual;
		}
		public void setCargaMaxima(int cargaMaxima){
			if(this.cargaMaxima<=100) {
				this.cargaMaxima = cargaMaxima;
			}
		}
		public void setCargaMinima(int cargaMinima){
			
			this.cargaMinima = cargaMinima;
		}
		public void setCargaAtual(int cargaAtual){
		
			if(cargaAtual >= cargaMinima && cargaAtual <= cargaMaxima) {
				this.cargaAtual = cargaAtual;
			}else {
				this.cargaAtual=cargaMinima;
			}
		}
		public int getCarga() {
			return carga;
		}
		public void setCarga(int carga) {
			
				
			
			this.carga = carga;
		}
	
		  void carregaBateria(int carga){
			  if(carga>=0){
				  if((carga+cargaAtual)>=cargaMaxima){
					  cargaAtual=cargaMaxima;
				  }else{
					  cargaAtual+=carga;
				  }
			             
			  }
		  }
		
		void descarregaBateria(int gastoEnergetico) {
			if(cargaAtual>0) {
				this.setCargaAtual(cargaAtual-gastoEnergetico);
			}else {
				if(cargaAtual< cargaMinima) {
				System.out.println("Rover descarregando,nescessita carga");
				}
			}
		}
		@Override
		public String toString() {
		return "B";
		}
}

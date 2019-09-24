package model;
public class BracoMecanico {
	   
		private int pesoMaximo;
		private boolean operacional=true;
		private int aberturaMaxima;
		private int gastoEnergetico=2;
		private int gravidade;
		
		
		
		public BracoMecanico(){

		}
		
		public Rocha pegaRocha(int posicao) throws FalhaNoSistemaException {
			Rocha r=new Rocha();
			Planeta p=new Planeta();
			try {
			if(operacional==true) {
				if(r.getDiametro()<=aberturaMaxima) {
					if(r.getMassa()<=pesoMaximo) {
						p.getObjetos()[posicao][posicao].remove(r);
						
					}
				}
			}else {
				throw new FalhaNoSistemaException();
				}
			}catch(FalhaNoSistemaException e) {
				
			}
			return r;
			
		}
		public int getPesoMaximo() {
			return pesoMaximo;
		}
		public void setPesoMaximo(int pesoMaximo) {
			this.pesoMaximo = pesoMaximo;
		}
		public boolean isOperacional() {
			return operacional;
		}
		public void setOperacional(boolean operacional) {
			this.operacional = operacional;
		}
		public int getAberturaMaxima() {
			return aberturaMaxima;
		}
		public void setAberturaMaxima(int aberturaMaxima) {
			this.aberturaMaxima = aberturaMaxima;
		}
		public int getGastoEnergetico() {
			return gastoEnergetico;
		}
		public void setGastoEnergetico(int gastoEnergetico) {
			this.gastoEnergetico = gastoEnergetico;
		}
		public int getGravidade() {
			return gravidade;
		}
		public void setGravidade(int gravidade) {
			this.gravidade = gravidade;
		}
		
		
		
		
	}



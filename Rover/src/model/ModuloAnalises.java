package model;
public class ModuloAnalises{
	private int gastoEnergetico=2;
	private int coordenadaAgua;
	private int totalAgua;
	private DepositoAmostras deposito;
	private StringBuilder relatorio;
	
	
	public ModuloAnalises(DepositoAmostras deposito)  {
		
		
	}
	public boolean analisaAmostra(Amostra a) {
		boolean confere=false;
		
         for(int i=0;i<a.getRocha().getSubstancias().length;i++) {
        	 if(a.getRocha().getSubstancias()[i].getFormula()=="H2O" && a.getRocha().getSubstancias()[i].getMassa()>500) {
        		 confere=true;
        	 }else {
        		 
        	 }
        	 if(confere==true) {
        		 System.out.println("encontrei agua");
        	 }
         }
		
		return confere;
	}
      
	
	public int getGastoEnergetico() {
		return gastoEnergetico;
	}

	public void setGastoEnergetico(int gastoEnergetico) {
		this.gastoEnergetico = gastoEnergetico;
	}

	public int getCoordenadaAgua() {
		
		return coordenadaAgua;
	}

	public void setCoordenadaAgua(int coordenadaAgua) {
		this.coordenadaAgua = coordenadaAgua;
	}

	public int getTotalAgua() {
		return totalAgua;
	}

	public void setTotalAgua(int totalAgua) {
		
		this.totalAgua = totalAgua;
	}

	public DepositoAmostras getDeposito() {
		return deposito;
	}

	public void setDeposito(DepositoAmostras deposito) {
		this.deposito = deposito;
	}
	public String getRelatorio() {
		return relatorio.toString();
	}
	public void setRelatorio(StringBuilder relatorio) {
		Amostra a = new Amostra() ;
		for(int i=0;i<a.getRocha().getSubstancias().length;i++) {
			relatorio.append(a.getRocha().getSubstancias()[i].getNome());
			relatorio.append(a.getRocha().getSubstancias()[i].getMassa());
			this.relatorio = relatorio;
		}
		
	}
}
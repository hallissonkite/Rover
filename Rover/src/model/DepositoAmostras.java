package model;
import java.util.ArrayList;

public class DepositoAmostras {
	
	private int totalAmostra;
	private int proxAmostra;
	private int finalFila;
	private int tamanho=10;
	private ArrayList<Amostra>[] amostras;
	
	
	public DepositoAmostras() {
		
	}
	
	public void adicionaAmostra(Amostra a) {
		if(totalAmostra < this.getTamanho()) {
			if(amostras[finalFila] == null ) { 
				amostras[finalFila].add(a);
				totalAmostra++;
				amostras[proxAmostra]=amostras[finalFila];
			}else {
				System.out.println("DEPOSITO LOTADO");
			}
		}
		
	}
	public void removeAmostra(Amostra a,ArrayList<Object>[] ad) {
		if(amostras[proxAmostra] != null) {
			amostras[proxAmostra].remove(a);
		}else {
			System.out.println("DEPOSITO VAZIO");
		}
	}
	
	
	public int getTotalAmostra() {
		return totalAmostra;
	}
	public void setTotalAmostra(int totalAmostra) {
		if(totalAmostra>0 && totalAmostra<this.getTamanho()) {
		this.totalAmostra = totalAmostra;
		}
	}
	public int getProxAmostra() {
		return proxAmostra;
	}
	public void setProxAmostra(int proxAmostra) {
		this.proxAmostra = proxAmostra;
	}
	public int getFinalFila() {
		return finalFila;
	}
	public void setFinalFila(int finalFila) {
		this.finalFila = finalFila;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public ArrayList<Amostra>[] getAdiciona() {
		return amostras;
	}

	public void setAdiciona(ArrayList<Amostra>[] amostras) {
		this.amostras = amostras;
	}
}

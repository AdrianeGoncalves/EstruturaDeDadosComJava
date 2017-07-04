package com.adriane.goncalves.estruturadados.vetor;

public class Vetor {
	
	String[] elementos;
	int tamanho = 0;
	
	public Vetor(int capacidade){
		this.elementos = new String[capacidade];
	}
	
	public void adiciona(String elemento) throws Exception{
		if(tamanho<this.elementos.length){
			this.elementos[tamanho] = elemento;
			tamanho++;
		}else{
			throw new Exception("Todas as posições do vetor já se encontram preenchidas");
		}
	}

}

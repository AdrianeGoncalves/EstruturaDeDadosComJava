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
	
	public String buscar(int posicao){
		if(!(posicao>=0 && posicao<tamanho)){
			throw new IllegalArgumentException("Posição Inválida!");
		}
		return elementos[posicao];
	}
	
	public int Contem(String elemento){
		for(int i = 0; i<tamanho;i++){
			if(elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}
	
	public int tamanho(){
		return this.tamanho;
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i<this.tamanho-1;i++){
			s.append(elementos[i]);
			s.append(",");
		}
		
		if(this.tamanho>0){
			s.append(elementos[this.tamanho-1]);
		}
		s.append("]");
		
		return s.toString();
	}
	
}

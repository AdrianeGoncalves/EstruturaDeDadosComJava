package com.adriane.goncalves.estruturadados.vetor.teste;

import com.adriane.goncalves.estruturadados.vetor.Vetor;

public class PrincipalTeste {
	public static void main(String[]args){
		
		Vetor v = new Vetor(2);
		
		try {
			v.adiciona("elemento 1"); // elemento 1 adicionado na posicao 0
			v.adiciona("elemento 2"); // elemento 2 adicionado na posicao 1
			System.out.println(v.buscar(1)); //Verifica se existe elemento na posicao 1 e retorna o conteudo
			System.out.println(v.Contem("elemento 1")); //Verifica se contém o elemento no vetor
			System.out.println(v.Contem("elemento 4")); //Verifica se contém o elemento no vetor
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

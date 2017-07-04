package com.adriane.goncalves.estruturadados.vetor.teste;

import com.adriane.goncalves.estruturadados.vetor.Vetor;

public class PrincipalTeste {
	public static void main(String[]args){
		
		Vetor v = new Vetor(2);
		
		try {
			v.adiciona("Adriane");
			v.adiciona("Thalia");
			System.out.println(v.buscar(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

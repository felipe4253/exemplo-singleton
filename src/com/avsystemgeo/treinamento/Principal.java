package com.avsystemgeo.treinamento;

public class Principal {
	
	public static void main(String[] args) {
		Pessoa pessoa1 = Pessoa.getInstancia();
		pessoa1.setNome("José");
		
		System.out.println("Pessoa 1 " + pessoa1.getNome());
		
		Pessoa pessoa2 = Pessoa.getInstancia();
		pessoa2.setNome("Maria");
		
		System.out.println("Pessoa 1 " + pessoa1.getNome());
		System.out.println("Pessoa 2 " + pessoa2.getNome());
		
	}
	

}

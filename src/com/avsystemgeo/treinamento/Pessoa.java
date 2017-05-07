package com.avsystemgeo.treinamento;


/**
 * Exemplo de implementação do design patter Singleton
 * @author felipe
 *
 */
public class Pessoa {
	
	private String nome;
	

	//Variavel estática para que só exista uma desta classe
	private static Pessoa instancia;
	
	//Construtor privado para só permitir que métodos dentro desta classe instanciem esta classe
	private Pessoa() {
		
	}
	
	//Metodo publico e estático para retornar a única instancia desta pessoa
	public static Pessoa getInstancia() {
		if (Pessoa.instancia == null) {
			Pessoa.instancia = new Pessoa();
		}
		return Pessoa.instancia;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}

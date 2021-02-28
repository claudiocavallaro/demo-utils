package com.example.testdb.demodb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	private long id;

	@JsonProperty("nome")
	private String nome;

	@JsonProperty("cognome")
	private String cognome;

	public User() {
	}

	public User(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "User{" + "nome='" + nome + '\'' + ", cognome='" + cognome + '\'' + '}';
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
}
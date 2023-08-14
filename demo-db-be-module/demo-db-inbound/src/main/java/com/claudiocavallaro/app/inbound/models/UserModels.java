package com.claudiocavallaro.app.inbound.models;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserModels implements Serializable{

	private static final long serialVersionUID = 7414853258056439954L;
	
	private long id;
	private String nome;
	private String cognome;
	
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

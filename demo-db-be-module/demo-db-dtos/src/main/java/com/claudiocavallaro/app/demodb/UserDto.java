package com.claudiocavallaro.app.demodb;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDto implements Serializable{

	private static final long serialVersionUID = -4304946296156291271L;
	
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

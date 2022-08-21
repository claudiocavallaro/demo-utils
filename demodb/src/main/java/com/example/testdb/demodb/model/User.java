package com.example.testdb.demodb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "userdb")
public class User implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "nome")
    @JsonProperty("nome")
    private String nome;

    @Column(name = "cognome")
    @JsonProperty("cognome")
    private String cognome;

    protected User(){}

    public User(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}
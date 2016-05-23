package org.dstech.videoteca.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

public abstract class User2 implements Persona{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(min=1, max=50) 
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "DATA", nullable = false)
	private Date dataDiNascita;
	
	@Size(min=1, max=50) 
	@Column(name = "USER", nullable = false)
	private String user;
	
	@Size(min=1, max=50) 
	@Column(name = "PASS", nullable = false)
	private String pass;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
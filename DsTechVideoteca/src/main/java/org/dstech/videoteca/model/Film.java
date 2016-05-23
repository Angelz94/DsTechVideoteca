package org.dstech.videoteca.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Film implements ProdottoCinematografico{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(min=1, max=50) 
	@Column(name = "TITOLO", nullable = false)
	private String titolo;

	@NotNull
	@Digits(integer=8, fraction=2)
	@Column(name = "DURATA", nullable = false)
	private int durata;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", titolo=" + titolo + ", durata=" + durata + "]";
	}
	
	
}

package org.dstech.videoteca.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

public class SerieTv implements ProdottoCinematografico{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(min=1, max=50) 
	@Column(name = "TITOLO", nullable = false)
	private String titolo;
	


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



	@Override
	public String toString() {
		return "SerieTv [id=" + id + ", titolo=" + titolo + " ]";
	}
	
	
	
}

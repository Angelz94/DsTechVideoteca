package org.dstech.videoteca.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "film",catalog ="videoteca")


public class Film implements ProdottoCinematografico,java.io.Serializable{

	@ManyToMany(fetch=FetchType.LAZY,mappedBy= "film")
private Set<Attore> attore=new HashSet<Attore>(0);

	@ManyToMany(fetch=FetchType.LAZY,mappedBy= "film")
	private Set<Categoria> categoria=new HashSet<Categoria>(0);
	
//public Film(){
//		
//	}
//    public Film(String titolo,int durata ){
//		this.titolo=titolo;
//		this.durata=durata;
//		
//	}
//    public Film(String titolo,int durata,Set<Attore> attore){
//		this.titolo=titolo;
//		this.durata=durata;
//		this.attore=attore;
//    }
//	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FILM_ID",unique=true,  nullable = false)
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

	
	public Set<Attore> getAttore() {
		return this.attore;
	}

	public void setAttore(Set<Attore> attore) {
		this.attore = attore;
	}
	
	
	
}


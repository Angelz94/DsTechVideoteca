package org.dstech.videoteca.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name = "serieTv",catalog ="videoteca")


public class SerieTv implements ProdottoCinematografico,java.io.Serializable{
	
	
	
	@ManyToMany(fetch=FetchType.LAZY,mappedBy= "serieTv")
	private Set<Attore> attore=new HashSet<Attore>(0);
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CATEGORIA", nullable = false)
	private Categoria categoria;
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "serieTv")
	
	private Set<Stagione> stagione;
	
	public Set<Stagione> getStagione() {
		return stagione;
	}

	public void setStagione(Set<Stagione> stagione) {
		this.stagione = stagione;
	}
	

//public SerieTv(){
//		
//	}
//    public SerieTv(String titolo,int durata ){
//		this.titolo=titolo;
//		
//		
//	}
//    public SerieTv(String titolo,int durata,Set<Attore> attore){
//		this.titolo=titolo;
//		this.attore=attore;
//    }
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SERIETV_ID", unique=true,nullable = false)
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

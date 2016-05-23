package org.dstech.videoteca.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "categoria",catalog ="videoteca")

public class Categoria implements java.io.Serializable {
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "categoria_film", catalog = "videoteca", joinColumns = { 
			@JoinColumn(name = "CATEGORIA_ID", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "FILM_ID", 
					nullable = false, updatable = false) })
	
	private Set<Film> film=new HashSet<Film>(0);
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "categoria_serieTv", catalog = "videoteca", joinColumns = { 
			@JoinColumn(name = "CATEGORIA_ID", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "SERIETV_ID", 
					nullable = false, updatable = false) })
	
	private Set<SerieTv> serieTv=new HashSet<SerieTv>(0);
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Size(min = 3, max = 15)
	@Column(name = "NOME", nullable = false)
	private String nome;

	@Size(min = 3, max = 100)
	@Column(name = "DESCRIZIONE", nullable = false)
	private String descrizione;

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

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nome=" + nome + ", descrizione=" + descrizione + "]";
	}

	
	

}

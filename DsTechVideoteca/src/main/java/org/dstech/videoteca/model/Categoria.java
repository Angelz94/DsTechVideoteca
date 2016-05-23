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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "categoria",catalog ="videoteca")

public class Categoria implements java.io.Serializable {
	
@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
	
	private Set<SerieTv> serieTv;
	
	public Set<SerieTv> getSerieTv() {
		return serieTv;
	}

	public void setSerieTv(Set<SerieTv> serieTv) {
		this.serieTv = serieTv;
	}
	
@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
	
	private Set<Film> film;
	
	public Set<Film> getFilm() {
		return film;
	}

	public void setFilm(Set<Film> film) {
		this.film = film;
	}
	
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

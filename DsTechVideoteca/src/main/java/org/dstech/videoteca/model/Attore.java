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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;


	@Entity
	@Table(name = "attore",catalog ="videoteca", uniqueConstraints ={
 	@UniqueConstraint(columnNames="CF")
	})
		
	public class Attore implements Persona,java.io.Serializable {
	
		@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinTable(name = "attori_film", catalog = "videoteca", joinColumns = { 
				@JoinColumn(name = "ATTORI_ID", nullable = false, updatable = false) }, 
				inverseJoinColumns = { @JoinColumn(name = "FILM_ID", 
						nullable = false, updatable = false) })
		
		private Set<Film> film=new HashSet<Film>(0);
		
		@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinTable(name = "attori_serieTv", catalog = "videoteca", joinColumns = { 
				@JoinColumn(name = "ATTORI_ID", nullable = false, updatable = false) }, 
				inverseJoinColumns = { @JoinColumn(name = "SERIETV_ID", 
						nullable = false, updatable = false) })
		
		private Set<SerieTv> serieTv=new HashSet<SerieTv>(0);
//	public Attore(){
//		
//	}
//    public Attore(String nome,String cognome,LocalDate data_di_nascita,String CF ){
//		this.nome=nome;
//		this.cognome=cognome;
//		this.data_di_nascita=data_di_nascita;
//		this.CF=CF;
//	}
//    public Attore(String nome,String cognome,LocalDate data_di_nascita,String CF ,Set<Film> film){
//		this.nome=nome;
//		this.cognome=cognome;
//		this.data_di_nascita=data_di_nascita;
//		this.CF=CF;
//		this.film=film;
//	}
//    public Attore(String nome,String cognome,LocalDate data_di_nascita,String CF ,Set<SerieTv> film){
//		this.nome=nome;
//		this.cognome=cognome;
//		this.data_di_nascita=data_di_nascita;
//		this.CF=CF;
//		this.film=film;
//	}
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ATTORI_ID", unique=true,nullable = false)
	private int id;

	@Size(min = 1, max = 50)
	@Column(name = "NOME", nullable = false)
	private String nome;

	@Size(min = 1, max = 50)
	@Column(name = "COGNOME", nullable = false)
	private String cognome;

	@NotNull
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	@Column(name = "data_di_nascita", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate data_di_nascita;

	@Size(min = 1, max = 50)
	@Column(name = "CF", nullable = false)
	private String CF;

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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataDiNascita() {
		return data_di_nascita;
	}

	public void setDataDiNascita(LocalDate data_di_nascita) {
		this.data_di_nascita = data_di_nascita;
	}

	public String getCF() {
		return CF;
	}

	public void setCF(String CF) {
		this.CF = CF;
	}

	
	public Set<Film> getFilm() {
		return this.film;
	}

	public void setFilm(Set<Film> film) {
		this.film = film;
	}
	
	}
	
	
	
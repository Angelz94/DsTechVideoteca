package org.dstech.videoteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "user",catalog ="videoteca")
public class User implements Persona{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(min=1, max=50) 
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Size(min=1, max=50) 
	@Column(name = "COGNOME", nullable = false)
	private String cognome;
	
	@NotNull
	@DateTimeFormat(pattern="dd/MM/yyyy") 
	@Column(name = "data_di_nascita", nullable = false)
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate data_di_nascita;
	
	@Size(min = 1, max = 50)
	@Column(name = "CF", nullable = false)
	private String CF;

	@Size(min=1, max=50) 
	@Column(name = "USER", nullable = false)
	private String user;
	
	@Size(min=1, max=50) 
	@Column(name = "PASS", nullable = false)
	private String pass;
	
	@Size(min=2, max=10) 
	@Column(name = "RUOLO", nullable = false)
	private String ruolo;
	
	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

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
	
	public String getCF(String CF) {
		return CF;
	}
	
	public void setCF(String CF) {
		this.setCF(CF);
		
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

	@Override
	public String toString() {
		return "User [id=" + id + ", ruolo=" + ruolo + ", nome=" + nome + ", cognome=" + cognome + ", data_di_nascita=" + data_di_nascita
				+ ", user=" + user + ", pass=" + pass + "]";
	}

	

	
}
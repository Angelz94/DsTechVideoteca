package org.dstech.videoteca.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

public abstract class Attore implements Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Size(min = 1, max = 50)
	@Column(name = "NOME", nullable = false)
	private String nome;

	@Size(min = 1, max = 50)
	@Column(name = "COGNOME", nullable = false)
	private String cognome;

	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
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

	public void setcF(String CF) {
		this.CF = CF;
	}

	@Override
	public String toString() {
		return "Attore [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", data_di_nascita=" + data_di_nascita
				+ ", CF=" + CF + "]";
	}

}

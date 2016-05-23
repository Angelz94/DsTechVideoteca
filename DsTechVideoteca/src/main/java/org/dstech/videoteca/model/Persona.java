package org.dstech.videoteca.model;

import org.joda.time.LocalDate;

public interface Persona {

	public int getId();
	public String getNome();
	public String getCognome();
	public LocalDate getDataDiNascita();
	
	public void setNome(String nome);
	public void setCognome(String cognome);
	public void setDataDiNascita(LocalDate data_di_nascita);
	public void setCF(String CF);
	
}

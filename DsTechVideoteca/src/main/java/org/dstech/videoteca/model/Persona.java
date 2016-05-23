package org.dstech.videoteca.model;

import org.joda.time.LocalDate;

public interface Persona {

	public int id();
	public String nome();
	public String cognome();
	public LocalDate data_di_nascita();
	
}

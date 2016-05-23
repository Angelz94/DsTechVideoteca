package org.dstech.videoteca.model;

import org.joda.time.LocalDate;

public interface Persona {

	public int getId();
	public String getNome();
	public String getCognome();
	public LocalDate getDataDiNascita();
	
}

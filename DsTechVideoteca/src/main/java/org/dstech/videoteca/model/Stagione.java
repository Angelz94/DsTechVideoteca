package org.dstech.videoteca.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "stagione",catalog ="videoteca")

public class Stagione implements java.io.Serializable {
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "SERIE_TV", nullable = false)
	private SerieTv serieTv;

	
	
	public SerieTv getSerieTv() {
		return serieTv;
	}

	public void setSerieTv(SerieTv serieTv) {
		this.serieTv = serieTv;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="NUMEROPUNTATE",nullable=false)
	private int numeroPuntate;
	
	@Column(name="ANNOPRODUZIONE",nullable=false)
	private int annoProduzione;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroPuntate() {
		return numeroPuntate;
	}

	public void setNumeroPuntate(int numeroPuntate) {
		this.numeroPuntate = numeroPuntate;
	}

	public int getAnnoProduzione() {
		return annoProduzione;
	}

	public void setAnnoProduzione(int annoProduzione) {
		this.annoProduzione = annoProduzione;
	}

	@Override
	public String toString() {
		return "Stagione [id=" + id + ", numeroPuntate=" + numeroPuntate + ", annoProduzione=" + annoProduzione + "]";
	}

	

}

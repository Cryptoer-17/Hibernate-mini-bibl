package com.mkyong.stock;

import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "persona_has_libro", catalog = "minibibl")
@AssociationOverrides({
		@AssociationOverride(name = "pk.libro", joinColumns = @JoinColumn(name = "idLibro")),
		@AssociationOverride(name = "pk.persona", joinColumns = @JoinColumn(name = "idPersona")) })
public class PersonaLibro implements java.io.Serializable {

	private PersonaLibroId pk = new PersonaLibroId();
	private int giorni_possesso;
	private int giorni_scadenza;
	private String data_restituzione;
	private String data_prestito;
	private int giorni_ritardo_restuzione;
	
	
	public PersonaLibro() {
	}

	@EmbeddedId
	public PersonaLibroId getPk() {
		return pk;
	}

	public void setPk(PersonaLibroId pk) {
		this.pk = pk;
	}

	@Transient
	public Libro getLibro() {
		return getPk().getLibro();
	}

	public void setLibro(Libro libro) {
		getPk().setLibro(libro);
	}

	@Transient
	public Persona getPersona() {
		return getPk().getPersona();
	}

	public void setPersona(Persona persona) {
		getPk().setPersona(persona);
	}

	
	@Column(name = "GiorniPossesso", nullable = false)
	public int getGiorni_possesso() {
		return giorni_possesso;
	}

	public void setGiorni_possesso(int giorni_possesso) {
		this.giorni_possesso = giorni_possesso;
	}

	@Column(name = "GiorniScadenza", nullable = false)
	public int getGiorni_scadenza() {
		return giorni_scadenza;
	}

	public void setGiorni_scadenza(int giorni_scadenza) {
		this.giorni_scadenza = giorni_scadenza;
	}

	@Column(name = "DataRestituzione", nullable = false)
	public String getData_restituzione() {
		return data_restituzione;
	}

	public void setData_restituzione(String data_restituzione) {
		this.data_restituzione = data_restituzione;
	}
	
	
	@Column(name = "DataPrestito", nullable = false)
	public String getData_prestito() {
		return data_prestito;
	}

	public void setData_prestito(String data_prestito) {
		this.data_prestito = data_prestito;
	}
	
	@Column(name = "GiorniRitardoRestituzione", nullable = false)
	public int getGiorni_ritardo_restuzione() {
		return giorni_ritardo_restuzione;
	}

	public void setGiorni_ritardo_restuzione(int giorni_ritardo_restuzione) {
		this.giorni_ritardo_restuzione = giorni_ritardo_restuzione;
	}
	

}
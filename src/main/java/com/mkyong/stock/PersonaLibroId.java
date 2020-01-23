package com.mkyong.stock;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class PersonaLibroId implements java.io.Serializable {

	private Libro libro;
    private Persona persona;

	@ManyToOne
	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@ManyToOne
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	
    
}
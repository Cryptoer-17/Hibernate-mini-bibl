package com.mkyong.stock;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class PersonaLibroId implements java.io.Serializable {

	private Libro libro;
    private Persona persona;

	@ManyToOne
	public Libro getStock() {
		return libro;
	}

	public void setStock(Libro libro) {
		this.libro = libro;
	}

	@ManyToOne
	public Persona getCategory() {
		return persona;
	}

	public void setCategory(Persona persona) {
		this.persona = persona;
	}

	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonaLibroId that = (PersonaLibroId) o;

        if (libro != null ? !libro.equals(that.libro) : that.libro != null) return false;
        if (persona != null ? !persona.equals(that.persona) : that.persona != null)
            return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (libro != null ? libro.hashCode() : 0);
        result = 31 * result + (persona != null ? persona.hashCode() : 0);
        return result;
    }
    
}
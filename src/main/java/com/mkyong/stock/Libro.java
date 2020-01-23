package com.mkyong.stock;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "libro", catalog = "minibibl", uniqueConstraints = {
		@UniqueConstraint(columnNames = "Titolo"),
		@UniqueConstraint(columnNames = "Genere") })
public class Libro implements java.io.Serializable {

	private Integer idLibro;
	private String titolo;
	private String genere;
	private Set<PersonaLibro> personaLibri = new HashSet<PersonaLibro>(0);

	public Libro() {
	}

	public Libro(String titolo, String genere) {
		this.titolo = titolo;
		this.genere = genere;
	}

	public Libro(String titolo, String genere,
			Set<PersonaLibro> personaLibri) {
		this.titolo = titolo;
		this.genere = genere;
		this.personaLibri = personaLibri;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idLibro", unique = true, nullable = false)
	public Integer getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}

	@Column(name = "Titolo", unique = true, nullable = false, length = 10)
	public String getTitolo() {
		return titolo;
	}

	

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	@Column(name = "Genere", unique = true, nullable = false, length = 20)
	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.libro", cascade=CascadeType.ALL)
	public Set<PersonaLibro> getPersonaLibri() {
		return this.personaLibri;
	}

	

	public void setPersonaLibri(Set<PersonaLibro> personaLibri) {
		this.personaLibri = personaLibri;
	}

}
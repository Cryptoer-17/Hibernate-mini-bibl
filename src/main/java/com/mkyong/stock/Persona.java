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

@Entity
@Table(name = "persona", catalog = "minibibl")
public class Persona implements java.io.Serializable {

	private Integer idPersona;
	private String nome;
	private String cognome;
	private String data_nascita;
	private String username;
	private String password;
	private String admin;
	private Set<PersonaLibro> personaLibri = new HashSet<PersonaLibro>(0);

	public Persona() {
	}



	public Persona(String nome, String cognome, String data_nascita, String username, String password, String admin) {
		this.nome = nome;
		this.cognome = cognome;
		this.data_nascita = data_nascita;
		this.username = username;
		this.password = password;
		this.admin = admin;
	}


	public Persona(String nome, String cognome, String data_nascita, String username, String password, String admin,
			Set<PersonaLibro> personaLibri) {
		this.nome = nome;
		this.cognome = cognome;
		this.data_nascita = data_nascita;
		this.username = username;
		this.password = password;
		this.admin = admin;
		this.personaLibri = personaLibri;
	}




	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idPersona", unique = true, nullable = false)
	public Integer getIdPersona() {
		return idPersona;
	}



	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	@Column(name = "Nome", nullable = false, length = 10)
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	@Column(name = "Cognome", nullable = false)
	public String getCognome() {
		return cognome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	
	
	@Column(name = "DataNascita", nullable = false)
	public String getData_nascita() {
		return data_nascita;
	}



	public void setData_nascita(String data_nascita) {
		this.data_nascita = data_nascita;
	}

	
	
	@Column(name = "Username", nullable = false)
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	@Column(name = "Password", nullable = false)
	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "Administ", nullable = false)
	public String getAdmin() {
		return admin;
	}



	public void setAdmin(String admin) {
		this.admin = admin;
	}


	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.persona")
	public Set<PersonaLibro> getPersonaLibri() {
		return personaLibri;
	}



	public void setPersonaLibri(Set<PersonaLibro> personaLibri) {
		this.personaLibri = personaLibri;
	}

}
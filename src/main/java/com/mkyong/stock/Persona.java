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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "persona", catalog = "minibibl")
public class Persona implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idPersona")
	private Integer idPersona;
	@Column(name = "Nome")
	private String nome;
	@Column(name = "Cognome")
	private String cognome;
	@Column(name = "DataNascita")
	private String data_nascita;
	@Column(name = "Username")
	private String username;
	@Column(name = "Password")
	private String password;
	@Column(name = "Administ")
	private String admin;
/*	private Set<PersonaLibro> personaLibri = new HashSet<PersonaLibro>(0);*/
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idAccountUtente")
	private AccountUtente accountutente;
	
	
	public Persona() {
	}




	public Persona(String nome, String cognome, String data_nascita, String username,
			String password, String admin) {
		this.nome = nome;
		this.cognome = cognome;
		this.data_nascita = data_nascita;
		this.username = username;
		this.password = password;
		this.admin = admin;
	}



	public Persona(Integer idPersona, String nome, String cognome, String data_nascita, String username,
			String password, String admin) {
		this.idPersona = idPersona;
		this.nome = nome;
		this.cognome = cognome;
		this.data_nascita = data_nascita;
		this.username = username;
		this.password = password;
		this.admin = admin;
	}


/*
	public Persona(Integer idPersona, String nome, String cognome, String data_nascita, String username,
			String password, String admin, Set<PersonaLibro> personaLibri) {
		this.idPersona = idPersona;
		this.nome = nome;
		this.cognome = cognome;
		this.data_nascita = data_nascita;
		this.username = username;
		this.password = password;
		this.admin = admin;
		this.personaLibri = personaLibri;
	}*/



	
	public Integer getIdPersona() {
		return idPersona;
	}



	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
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


	
	
	public String getData_nascita() {
		return data_nascita;
	}



	public void setData_nascita(String data_nascita) {
		this.data_nascita = data_nascita;
	}

	
	
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	
	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getAdmin() {
		return admin;
	}



	public void setAdmin(String admin) {
		this.admin = admin;
	}


/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.persona")
	public Set<PersonaLibro> getPersonaLibri() {
		return personaLibri;
	}



	public void setPersonaLibri(Set<PersonaLibro> personaLibri) {
		this.personaLibri = personaLibri;
	}*/


	public AccountUtente getAccountutente() {
		return accountutente;
	}




	public void setAccountutente(AccountUtente accountutente) {
		this.accountutente = accountutente;
	}




	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nome=" + nome + ", cognome=" + cognome + ", data_nascita="
				+ data_nascita + ", username=" + username + ", password=" + password + ", admin=" + admin + "]";
	}
	
	

}
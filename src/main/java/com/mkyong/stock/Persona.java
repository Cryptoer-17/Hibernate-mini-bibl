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
@Table(name = "category", catalog = "mkyongdb")
public class Persona implements java.io.Serializable {

	private Integer categoryId;
	private String name;
	private String desc;
	private Set<PersonaLibro> personaLibros = new HashSet<PersonaLibro>(0);

	public Persona() {
	}

	public Persona(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public Persona(String name, String desc, Set<PersonaLibro> personaLibros) {
		this.name = name;
		this.desc = desc;
		this.personaLibros = personaLibros;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CATEGORY_ID", unique = true, nullable = false)
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "NAME", nullable = false, length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "[DESC]", nullable = false)
	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.category")
	public Set<PersonaLibro> getStockCategories() {
		return this.personaLibros;
	}

	public void setStockCategories(Set<PersonaLibro> personaLibros) {
		this.personaLibros = personaLibros;
	}

}
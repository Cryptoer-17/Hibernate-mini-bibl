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
@Table(name = "stock_category", catalog = "mkyongdb")
@AssociationOverrides({
		@AssociationOverride(name = "pk.stock", joinColumns = @JoinColumn(name = "STOCK_ID")),
		@AssociationOverride(name = "pk.category", joinColumns = @JoinColumn(name = "CATEGORY_ID")) })
public class PersonaLibro implements java.io.Serializable {

	private PersonaLibroId pk = new PersonaLibroId();
	private Date createdDate;
	private String createdBy;

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
	public Libro getStock() {
		return getPk().getStock();
	}

	public void setStock(Libro libro) {
		getPk().setStock(libro);
	}

	@Transient
	public Persona getCategory() {
		return getPk().getCategory();
	}

	public void setCategory(Persona persona) {
		getPk().setCategory(persona);
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_DATE", nullable = false, length = 10)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "CREATED_BY", nullable = false, length = 10)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		PersonaLibro that = (PersonaLibro) o;

		if (getPk() != null ? !getPk().equals(that.getPk())
				: that.getPk() != null)
			return false;

		return true;
	}

	public int hashCode() {
		return (getPk() != null ? getPk().hashCode() : 0);
	}
}
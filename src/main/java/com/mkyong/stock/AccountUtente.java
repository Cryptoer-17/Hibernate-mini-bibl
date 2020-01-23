package com.mkyong.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accountutente")
public class AccountUtente {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="idAccount")
		public int idAccount; 
		
		
		@Column(name="Attivato")
		public int Attivato;


		
		
		
		
		public AccountUtente() {
		
		}


		public AccountUtente(int attivato) {
			Attivato = attivato;
		}


		public int getAttivato() {
			return Attivato;
		}


		public void setAttivato(int attivato) {
			Attivato = attivato;
		}


		
		@Override
		public String toString() {
			return "AccountUtente [Id="+idAccount +" Attivato=" + Attivato + "]";
		}


		public int getIdAccount() {
			return idAccount;
		}


		public void setIdAccount(int idAccount) {
			this.idAccount = idAccount;
		}
		
		
}

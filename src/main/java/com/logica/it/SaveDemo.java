package com.logica.it;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mkyong.stock.*;

public class SaveDemo {

	
	public static void main(String []args) {	
	SessionFactory factory = new Configuration().configure().addAnnotatedClass(Persona.class).addAnnotatedClass(AccountUtente.class).buildSessionFactory();
	
    Session session = factory.getCurrentSession();
    
    try {
    	Persona Temppersona=
    			new Persona("Hom","Crom","1999-10-12","mar","mar","No");
    	
    	AccountUtente accountUtente=
    			new AccountUtente(1);
    	
    	Temppersona.setAccountutente(accountUtente);;
    	
    	session.beginTransaction();
    	
    	
    	System.out.println("Saving Instructor "+accountUtente);
    	session.save(Temppersona);
    	
    	
    	session.getTransaction().commit();
    }finally {
    	factory.close();
    }
}}

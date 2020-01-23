package com.logica.it;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class BibliotecaDAO {

/*	
	public static void insertPersona(String Nome,String Cognome,String DataNascita,String Username,String Psw) throws SQLException, ClassNotFoundException{		  
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(AccountUtente.class).addAnnotatedClass(Autore.class).addAnnotatedClass(Biblioteca.class).addAnnotatedClass(Libro.class).addAnnotatedClass(Persona.class).buildSessionFactory();			
	    Session session = factory.getCurrentSession();	
	    try {
	    	session.beginTransaction();	
	    	
	    	AccountUtente accountutente = new AccountUtente(1);
	    	 
	    	session.save(accountutente);
	    
	    	
	    	System.out.println("Ho salvato l'account :"+accountutente);

	    	
	    	Persona persona1 = new Persona(Nome,Cognome,DataNascita,Username,Psw,"No");
	    	
	    	    	
	    	persona1.setAccountutente(accountutente);    	
	    	session.save(persona1);
	    
	    	System.out.println("Hai salvato la persona con l'account:"+ persona1.getAccountutente());
	    	
	    	
		    	session.getTransaction().commit();
		    }finally {
		    	factory.close();
		    	session.close();
		    }
			
	}*/
}

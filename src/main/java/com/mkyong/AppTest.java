package com.mkyong;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mkyong.stock.Persona;
import com.mkyong.stock.Libro;
import com.mkyong.stock.PersonaLibro;
import com.mkyong.util.HibernateUtil;

public class AppTest {
	public static void main(String[] args) {
		System.out.println("Hibernate many to many - join table + extra column (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Libro libro1 = new Libro();
        libro1.setTitolo("Paladino");
        libro1.setGenere("Della Giustizzia");
 
        Persona persona1 = new Persona("Frank", "Kessy","1990-10-10","Sarem","Sarem","No");
        //new category, need save to get the id first
        
        
        System.out.println(persona1);
        session.save(persona1);

        //Category category1 = (Category)session.get(Category.class, 8);
       
        PersonaLibro personaLibro = new PersonaLibro();
        
        personaLibro.setLibro(libro1);
        personaLibro.setPersona(persona1);
        personaLibro.setGiorni_possesso(1);
        personaLibro.setGiorni_scadenza(80);
        personaLibro.setData_restituzione("2020-04-10");
        personaLibro.setData_prestito("2020-01-10");

        
       
       
        System.out.println("\n"+libro1.getPersonaLibri().add(personaLibro));
        
        session.save(libro1);
       
        Transaction transaction = session.getTransaction();
        transaction.commit();
		System.out.println("Done");
	}
}

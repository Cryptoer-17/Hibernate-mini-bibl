package com.mkyong;

import java.util.Date;
import org.hibernate.Session;
import com.mkyong.stock.Persona;
import com.mkyong.stock.Libro;
import com.mkyong.stock.PersonaLibro;
import com.mkyong.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate many to many - join table + extra column (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Libro libro = new Libro();
        libro.setStockCode("7052");
        libro.setStockName("PADINI");
 
        Persona category1 = new Persona("CONSUMER", "CONSUMER COMPANY");
        //new category, need save to get the id first
        session.save(category1);
        
        //Category category1 = (Category)session.get(Category.class, 8);
        
        PersonaLibro personaLibro = new PersonaLibro();
        
        personaLibro.setStock(libro);
        personaLibro.setCategory(category1);
        personaLibro.setCreatedDate(new Date());
        personaLibro.setCreatedBy("system");
        
        libro.getStockCategories().add(personaLibro);
        
        session.save(libro);
       
		session.getTransaction().commit();
		System.out.println("Done");
	}
}

package com.logica.it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;




public class Service {

	public static void insertPersona(BufferedReader reader) throws IOException, SQLException, ClassNotFoundException{
		boolean contatto_pronto=false;
		String username="";
	    String password="";
	    String confirm_password="";
	    String nome="";
	    String cognome="";
	    String dataNascita="";
	    do {	
		System.out.println("Registrati\nInserisci il tuo nome");
	   	 nome = reader.readLine();
	   	 System.out.println("Inserisci il tuo cognome");
	   	 cognome = reader.readLine();
	   	 System.out.println("Inserisci la tua data di nascita nel seguente formato YYYY-MM-DD");
	   	 dataNascita = reader.readLine();
	   	 System.out.println("Inserisci il tuo username");
	   	 username = reader.readLine();
	   	 System.out.println("Inserisci la tua password");
	   	 password = reader.readLine();
	   	 System.out.println("Conferma la tua password");
	   	 confirm_password = reader.readLine();
	   	 
	   	 
	   	 //Se psw=confirmpsw insert utente else deve rifare la procedura
	   	 if(password.equals(confirm_password)) {
	   	 contatto_pronto=true;
	   	 BibliotecaDAO.insertPersona(nome,cognome,dataNascita,username,password);
	   	 }
	   	 else System.out.println("Le due passowrd non corrispondo");
	    }while(!contatto_pronto);
	    
	    System.out.println("\nL'utente è stato registrato");
	    
	    visualizzazioneUtente(username);
	}
	
	
	public static void checkAutentication(BufferedReader reader){
		
	}
	
	public static void visualizzazioneUtente(String username) throws IOException, ClassNotFoundException, SQLException {
		
		  int id;
		  boolean exit =true;
		    do {
		    	BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
				System.out.println("SEI NELLA PAGINA DELLA BIBLIOTECA\nPREMENDO IL NUMERO \n -0:ESCI\n -1:VISUALIZZI LE BIBLIOTECHE A CUI SEI ASSOCIATO\n "
						+ "-2:VISUALIZZI I LIBRI IN POSSESSO\n -3:LIBRI DISPONIBILI NELLE BIBLIOTECHE A CUI SEI ASSOCIATO\n -4:AUTORI DEI LIBRI PRESENTI NELLE BIBLIOTECHE A CUI SEI ASSOCIATO\n -5:VISUALIZZA TUTTE LE BIBLIOTECHE DISPONIBILI PER ASSOCIARSI"
						+ "\n -6:ASSOCIATI AD UNA BIBLIOTECA\n -7:PRENDI UN LIBRO IN PRESTITO\n -8:RESTITUISCI UN LIBRO DI CUI SEI IN POSSESSO\n -9:VEDI LE DATE DEI TUOI LIBRI PRESI IN PRESTITO");
				System.out.println("Inserisci la tua scelta");
		     	String scelta = reader.readLine();
				
				//Se cancelli dati dal db devi usare la query nel DB per correggere il numero di id
			    switch(scelta) {
			    
			    /*		    case "1":
								BibliotecaDAO.displayPersonAssocBibl(username);
								break;			da decommentare*/
				
/*			    case "2":	
			    				BibliotecaDAO.displayPersonAssocLibr(username);
			    				break;
			    				
			    case "3":
			    				//per sapere i libri disponibili che può prendere in prestito in base alle sue biblioteche associate
			    				BibliotecaDAO.displayDisponibleLibr(username);
			    				break;
			    				
			    case "4":
						    	id= BibliotecaDAO.getIdUpdate(username);
			    				BibliotecaDAO.displayDisponibleLibrAutor(id);
			    				break;
			    
			    case "5":
			    				BibliotecaDAO.displayAllBiblio();
			    				break;
			    				
			    case "6":
			    				assocBibliot(reader,username);	
			    				break;
			    				
			    case "7":
			    				orderBook(reader,username);
			    				break;
			    				
			    case "8":
			    				giveBook(reader,username);
			    				break;
			    
			    
			    case "9":	
			    				id= BibliotecaDAO.getIdUpdate(username);
			    				BibliotecaDAO.displayAllDataOrder(id);
			    				break;*/
			    case "0":		
			    				exit=false;
			    
			    default :break;
			    }
			}while(exit);
		 
		   
		}
	
	

}

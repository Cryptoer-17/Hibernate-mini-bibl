package com.logica.it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("Sei già registrato? \nSi prega di rispondere con 'Si' o 'No'");
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	    String response = reader.readLine(); 
    
	 try {
	    if(response.equals("Si")) {
	    	Service.checkAutentication(reader);}
	    else {Service.insertPersona(reader);}
	 }catch(Exception e) {}   
	  
	   
	   
	}
}
package com.runner;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


import com.rest.Restaurant;

// getting error due to configuration file so remember to add it.

public class Restro_Main {

	public static void main(String[] args) 
	{
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		Scanner sc = new Scanner(System.in);
		int choice;
		
		do
		{
			Processes();
			System.out.println("enter your choice");
			  choice = sc.nextInt();
			System.out.println("The choice is: "+choice);
			Transaction transaction = session.beginTransaction();
	        switch(choice)
	        {
	          
	        case 1:
	        {
	        	System.out.println("enter the restaurant name: ");
	        	String r_name =sc.next();
	    		System.out.println("enter the city in which restaurant is: ");
	    		String r_city =sc.next();
	    		
	    		Restaurant res1= new Restaurant(0,r_name,r_city);
	    		
	    		session.save(res1);
	    		 transaction.commit();
	 			
	        }
	        break;
	        case 2:
	        {
	        	System.out.println("enter the restaurant id: ");
	        	int id = sc.nextInt();
	        	Restaurant res2 = new Restaurant();
	        	res2.setRestaurant_Id(id);
	        	session.update(res2);
	        	session.save(res2);
	        	transaction.commit();
	        }
	        break;
	        case 3:
	        {
	        	System.out.println("enter the restaurant id: ");
	        	int id = sc.nextInt();
	        	Restaurant res3 = new Restaurant();
	        	res3.setRestaurant_Id(id);
	        	session.delete(res3);
	        	session.save(res3);
	        	transaction.commit();
	        }
	        break;
	        case 4:
	        {
	        	Query query = session.createQuery("from restaurants");
List<Restaurant> res4 = query.list();
	        	
	        	for(Restaurant restaurant :res4)
	        	{
	        		System.out.println(res4);
	        	}
	        	transaction.commit();
	        }
	        break;
	        }
			
		}
		while(choice!=0);
		session.close();
		}

	private static void Processes()
	{
		System.out.println("\n Restuarant Application");
		System.out.println("1. Insert Restaurant");
		System.out.println("2. Update Restaurant");
		System.out.println("3. Delete Restaurant");
		System.out.println("4. display Restaurant");	
		
	}
	

}

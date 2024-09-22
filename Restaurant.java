package com.rest;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "restaurants")
public class Restaurant {
// id, name, city; done
	// list of menue
	
@Id	
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name ="restaurant_id")
 private int restaurant_Id 	;

@Column(name ="restaurant_name")
 private String restaurant_Name	;

@Column(name ="restaurant_city")
 private String restaurant_City 	;
 

@OneToMany(mappedBy="Restaurant")
List<Menu> menu; 

 public Restaurant() {
	// TODO Auto-generated constructor stub
}

public Restaurant(int restaurant_Id, String restaurant_Name, String restaurant_City) {
	super();
	this.restaurant_Id = restaurant_Id;
	this.restaurant_Name = restaurant_Name;
	this.restaurant_City = restaurant_City;
}

public int getRestaurant_Id() {
	return restaurant_Id;
}

public void setRestaurant_Id(int restaurant_Id) {
	this.restaurant_Id = restaurant_Id;
}

public String getRestaurant_Name() {
	return restaurant_Name;
}

public void setRestaurant_Name(String restaurant_Name) {
	this.restaurant_Name = restaurant_Name;
}

public String getRestaurant_City() {
	return restaurant_City;
}

public void setRestaurant_City(String restaurant_City) {
	this.restaurant_City = restaurant_City;
}

@Override
public String toString() {
	return "Restaurant [restaurant_Id=" + restaurant_Id + ", restaurant_Name=" + restaurant_Name + ", restaurant_City="
			+ restaurant_City + "]";
}
 
 
	
}

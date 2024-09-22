package com.rest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity(name = "menu")
public class Menu {
// id, dishname,  price and restoid as a foreign key;
	// resto obj
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="menu_id")
	private int menu_Id;
	
	@Column(name="dish_name")
	private String dish_Name;
	
	@Column(name="dish_price")
	private float dish_Price;
	
	 @ManyToOne
	 @JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;
	 
	 public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(int menu_Id, String dish_Name, float dish_Price, Restaurant restaurant) {
		super();
		this.menu_Id = menu_Id;
		this.dish_Name = dish_Name;
		this.dish_Price = dish_Price;
		this.restaurant = restaurant;
	}

	public int getMenu_Id() {
		return menu_Id;
	}

	public void setMenu_Id(int menu_Id) {
		this.menu_Id = menu_Id;
	}

	public String getDish_Name() {
		return dish_Name;
	}

	public void setDish_Name(String dish_Name) {
		this.dish_Name = dish_Name;
	}

	public float getDish_Price() {
		return dish_Price;
	}

	public void setDish_Price(float dish_Price) {
		this.dish_Price = dish_Price;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String toString() {
		return "Menu [menu_Id=" + menu_Id + ", dish_Name=" + dish_Name + ", dish_Price=" + dish_Price + ", restaurant="
				+ restaurant + "]";
	}
	 
	 
}

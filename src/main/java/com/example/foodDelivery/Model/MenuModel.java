package com.example.foodDelivery.Model;


import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Menu")
public class MenuModel {
	
	
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long menuId;

	@Column(nullable = false)
	private String foodName;
	
	private String foodDesc;
	
	private String price;
	
	@OneToMany(mappedBy = "menu")
    Set<OrderModel> OrderModel;
	
	

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}


	
	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodDesc() {
		return foodDesc;
	}

	public void setFoodDesc(String foodDesc) {
		this.foodDesc = foodDesc;
	}

}

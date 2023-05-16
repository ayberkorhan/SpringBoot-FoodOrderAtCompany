package com.example.foodDelivery.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class OrderModel {
	
	@Id
	@Column(length = 50)
	public String id; 
	


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String customerName;
	
	public String customerIp;
	
	public java.time.LocalTime getStartDate() {
		return startDate;
	}

	public void setStartDate(java.time.LocalTime startDate) {
		this.startDate = startDate;
	}

	public MenuModel getMenu() {
		return menu;
	}

	public void setMenu(MenuModel menu) {
		this.menu = menu;
	}

	private java.time.LocalTime startDate;
	
	
	 @ManyToOne
	 @JoinColumn(name = "menu_id")
	  private MenuModel menu;
	 
	


	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerIp() {
		return customerIp;
	}

	public void setCustomerIp(String customerIp) {
		this.customerIp = customerIp;
	}




	

}

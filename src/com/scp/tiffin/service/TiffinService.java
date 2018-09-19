package com.scp.tiffin.service;

import com.scp.tiffin.entity.Customer;

public interface TiffinService {
	
	public String breakFast ="BREAD-BUTTOR-JAM";
	public String lunchMenu ="Chapati-Bhaji";
	public String dinnerMenu ="SweetDish";

	
	public boolean preBooking(int qty);
	public boolean cancelOrder(int qty);
	public boolean placeOrder(int qty, String menu,Customer cust);
	public void setPrice();
	public String getVendor();
	public String getAddress();
}


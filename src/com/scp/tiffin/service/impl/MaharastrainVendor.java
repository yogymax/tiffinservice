package com.scp.tiffin.service.impl;

import com.scp.tiffin.entity.Customer;
import com.scp.tiffin.service.TiffinService;

public class MaharastrainVendor implements TiffinService {

	private final int totalNoOfBookings = 70;
	private static final double breakFastPrice = 50.10;
	private static final double lunchFastPrice = 110;
	private static final double dinnerFastPrice = 180.10;
	
	
	
	@Override
	public boolean preBooking(int qty) {
		System.out.println("MH - -prebooking called");
		return false;
	}

	@Override
	public boolean cancelOrder(int qty) {
		System.out.println("MH - -cancelOrder called");
		return false;
	}

	@Override
	public boolean placeOrder(int qty, String menu,Customer cust) {
		System.out.println("MH - -placeOrder called");
		return false;
	}

	@Override
	public void setPrice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getVendor() {
		return "MH";
	}

	@Override
	public String getAddress() {
		return "Kop";
	}
	
	public void mhSpecialDish(){
		
	}

}

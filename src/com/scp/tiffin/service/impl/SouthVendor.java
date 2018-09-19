package com.scp.tiffin.service.impl;

import com.scp.tiffin.entity.Customer;
import com.scp.tiffin.service.TiffinService;

public class SouthVendor implements TiffinService{

	private final static int totalNoOfBookings = 100; // No of bookings serve kr skte ho
	private static int currentBookings = 0; // abhi kitne booings hai
	
	private static final double breakFastPrice = 60.10; 
	private static final double lunchPrice = 120;
	private static final double dinnerPrice = 160.10;
	
	@Override
	public boolean preBooking(int qty) {
		int tempBooking = currentBookings+qty; // jitana booking qty + current booking -- idea -- 
		if(tempBooking > totalNoOfBookings || qty <=0){
			System.out.println("Cannot provide service..already booking fulled");
			return false;
		}
		currentBookings = tempBooking;
		return true;	
	}

	@Override
	public boolean cancelOrder(int qty) {
		System.out.println("Current Bookings Before Order cancellation---" + currentBookings);
		
		if(qty >= 10 ||  qty <= 0){
			System.out.println("qty is greater than 10 or less than zero so cannot be cancelled as per rules..!");
			return false;
		}
		//currentBookings = currentBookings-qty;
		currentBookings -=qty;
		
		System.out.println("Current Bookings after Order cancellation---" + currentBookings);
		return false;
	}

	@Override
	public boolean placeOrder(int qty, String menu, Customer cust) {
		System.out.println("Current Bookings Before PlaceOrder ---" + currentBookings);
		int tempBooking = currentBookings+qty;
		
		if(tempBooking > totalNoOfBookings || qty <=0){
			System.out.println("Cannot provide service..already booking fulled");
			return false;
		}
		
		
		double totolPrice = 0;
		switch(menu){
				case breakFast:
							totolPrice = breakFastPrice*qty;
							break;
				case lunchMenu:
							totolPrice = lunchPrice*qty;
							break;
				case dinnerMenu:
						totolPrice = dinnerPrice*qty;
						break;
				default:
					System.out.println("invalid menu");
		}			
			
		double custSaving = cust.getWalletSaving();
		if(totolPrice>custSaving){
			System.out.println("cannot book your order as no enough savings");
			return false;
		}
		
		currentBookings = tempBooking;
		cust.setWalletSaving(custSaving -totolPrice );
		System.out.println("Current Bookings after PlaceOrder ---" + currentBookings);
		return true;
	}

	@Override
	public void setPrice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getVendor() {
		return "South Vendor";
	}

	@Override
	public String getAddress() {
		return "Pune Katraj...!";
	}
	
	public void southSpecialDish(){
		
	}
	

}

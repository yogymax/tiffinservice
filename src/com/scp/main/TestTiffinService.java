		package com.scp.main;

import com.scp.tiffin.entity.Customer;
import com.scp.tiffin.service.TiffinService;
import com.scp.tiffin.service.impl.MaharastrainVendor;
import com.scp.tiffin.service.impl.SouthVendor;
		
		public class TestTiffinService {
				
			
			public static void main(String[] args) {
				
				Customer cust1 = new Customer(1,"Yogesh","Latur",1231231231,500);
				Customer cust2 = new Customer(2,"Amit","Latur",1231231231,1000);
				
				//TiffinService tService = new TiffinService(); interface no objects
				
				TiffinService southService = new SouthVendor(); // AB
				TiffinService mhService = new MaharastrainVendor(); // AB
				
				boolean prebookingAck = 	southService.preBooking(77);
				System.out.println(prebookingAck);
				southService.placeOrder(23,TiffinService.lunchMenu, cust1);
				
				System.out.println(prebookingAck);
				
				
			}
			
		}
		
		
		
		
		/**
		 * 
		 * TiffinService -- placeorder/cancelOrder/preBooking
		 * 	-- South
		 * 	-- MH
		 * Customer -- id/age/wallet/address
		 * TestClass	
		 * 	Main
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

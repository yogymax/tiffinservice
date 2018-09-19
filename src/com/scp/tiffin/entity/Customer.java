package com.scp.tiffin.entity;

/**
 * 
 * make sure all your variable should be private -- 
 * Right click on class -- select source 
 * 		-- generate constructor using fields
 * 		-- tostring method
 * 		-- getters -- setters
 * 
 */

public class Customer {
	
		private int custId;
		private String custName;
		private String custAddress;
		private int mobileNo;
		private double walletSaving;
		
		
		public Customer(int custId, String custName, String custAddress,
				int mobileNo, double walletSaving) {
			super();
			this.custId = custId;
			this.custName = custName;
			this.custAddress = custAddress;
			this.mobileNo = mobileNo;
			this.walletSaving = walletSaving;
		}


		public int getCustId() {
			return custId;
		}


		public void setCustId(int custId) {
			this.custId = custId;
		}


		public String getCustName() {
			return custName;
		}


		public void setCustName(String custName) {
			this.custName = custName;
		}


		public String getCustAddress() {
			return custAddress;
		}


		public void setCustAddress(String custAddress) {
			this.custAddress = custAddress;
		}


		public int getMobileNo() {
			return mobileNo;
		}


		public void setMobileNo(int mobileNo) {
			this.mobileNo = mobileNo;
		}


		public double getWalletSaving() {
			return walletSaving;
		}


		public void setWalletSaving(double walletSaving) {
			this.walletSaving = walletSaving;
		}


		@Override
		public String toString() {
			return "\n Customer [custId=" + custId + ", custName=" + custName
					+ ", custAddress=" + custAddress + ", mobileNo=" + mobileNo
					+ ", walletSaving=" + walletSaving + "]";
		}
		
		
		
		
		
		
		
		

}

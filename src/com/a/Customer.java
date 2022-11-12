package com.a;

public class Customer {
	
	// fullName
	//phoneNumber
	//address
	//email
	//balance
	//DOB
	//pin
	//accNumber
	
	
	//default constructor , parameterized constructor ,to string 
    // check my balance/ provide pin deposit/amount withdraw.
	
	
	
	private String fullName;
	private String phoneNumber;
	private String address;
	private String email;
	private double balance;
	private String DOB;
	private String pin;
	private int accNumber;
	
	
	public Customer() {
		this.fullName="";
		this.phoneNumber="";
		this.address="";
		this.email="";
		this.balance=0;
		this.DOB="";
		this.pin="";
		this.accNumber=0;
	}


	public Customer(String fullName, String phoneNumber, String address, String email, double balance, String dOB,
			String pin, int accNumber) {
		super();
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
		this.balance = balance;
		DOB = dOB;
		this.pin = pin;
		this.accNumber = accNumber;
	}
	
	
	
	public double checkBalance(String providePIN) {
		if (pin.equals(providePIN)) {
			System.out.println("see your balance");
			return balance;
			
		}else {
			System.out.println("you can not see your balance");
			 return -1;
		}
			
		
	}
	
	public boolean deposit(double amount,int accNumber,String pin) {
		if (this.accNumber!=accNumber || !this.pin.equals(pin)) {
			System.out.println("incorrct info");
			return false;
			
		}
		this.balance+=amount;
		System.out.println("$"+amount +" has been deposit to your account");
		return true;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getDOB() {
		return DOB;
	}


	public void setDOB(String dOB) {
		DOB = dOB;
	}


	public String getPin() {
		return pin;
	}


	public void setPin(String pin) {
		this.pin = pin;
	}


	public int getAccNumber() {
		return accNumber;
	}


	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}


	@Override
	public String toString() {
		return "Customer [fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", address=" + address + ", email="
				+ email + ", balance=" + balance + ", DOB=" + DOB + ", pin=" + pin + ", accNumber=" + accNumber + "]";
	}
	
	
	
}
package com.cg.pwa.beans;

public class Account {
	private String Name;
	private String Number;
	private int AccBalance;
	
	
	static int id=31;
	public Account(){}
	
	public Account(String Name,String Number,int AccBalance){
		
		this.Name=Name;
		this.Number=Number;
		this.AccBalance=AccBalance;
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public int getAccBalance() {
		return AccBalance;
	}
	public void setAccBalance(int accBalance) {
		AccBalance = accBalance;
	}

	public String toString(){
		return " [Mobile Number:]"+Number+"[Name:]" +Name +" [Balance:] "+AccBalance;
	}
}
package customer;

import java.util.ArrayList;

public class Customer {
	
	
	private String name;
	private float credit;
	
	private ArrayList<Customer> customers;
	
	
	public Customer()
	{
		customers = new ArrayList<>();
	}
	
	
	public String getName() {
		return name;
	}
	public float getCredit() {
		return credit;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCredit(float credit) {
		this.credit = credit;
	}
	
	

}

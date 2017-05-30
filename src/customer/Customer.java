package customer;

import java.util.ArrayList;

import jdk.nashorn.internal.ir.WhileNode;

public class Customer {
	
	
	private String name;
	private float credit;
	
	private ArrayList<Customer> customers;
	
	
	public Customer()
	{
//		customers = new ArrayList<>();
		print();
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
	
	public void print()
	{
		int n = 1;
		int sum = 0;
		int kony = 0;
		int summm = 0;
		while (sum != n) 
		{
			
			n = n+1;
			sum = 1;
			int x = 2;
			while(x*x < n)
			{
				summm ++;
				int a = n/x;
				if(a*x == n )
				{
					
					kony = kony+1;
					sum = sum+x+a;
					System.out.println("Summe : "+ sum);
				}
				x = x +1;
				System.out.println("Number n : "+ n);
				System.out.println("Number x : "+ x);
			}
			
			
		}
		System.out.println(n);
		System.out.println("Summmm"+summm);
		System.out.println("Kony "+kony);
	}
	
	
	public static void main(String[] args) 
	{
		new Customer();
	}

}

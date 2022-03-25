package Basic_assgn;

import java.util.Scanner;

public class Productprice {
	int price;
	String pname;
	
	void put()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter pname= ");
	pname=s.next();			
	System.out.println("Enter price= ");
	price=s.nextInt();
	}
	
	void show()
	{
	System.out.println(pname+" "+price);
	}
	void calculate() 
	{
	if(price>2000) 
		System.out.println("Discount=10%");
	else
		System.out.println("Discount=7%");
		
	}
	public static void main(String[] args) {
		Productprice p=new Productprice();
		p.put();
		p.show();
		p.calculate();
		
	}

}

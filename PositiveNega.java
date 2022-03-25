package Basic_assgn;

import java.util.Scanner;

public class PositiveNega {
	int number;
	
	Scanner s =new Scanner(System.in);

	void put() {
		System.out.println("Enter number= ");
		number=s.nextInt();
		String result=number>=0?"Positive": "Negative";
		System.out.print(result+" "+number);

		
		
			
	}
	
	
	public static void main(String[] args) {
		
		PositiveNega p=new PositiveNega();
		p.put();
		
		}

}



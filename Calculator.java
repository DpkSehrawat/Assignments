package Assignment;

import java.util.Scanner;

public class Calculator {

	public static void calc(int x, int y, int z) throws nonNegativeException {
		
		switch (z) {
		case 1: {
			System.out.println(x+y);	
			//break;
		}
		case 2: {
			System.out.println(x-y);
		//	break;
		}
		case 3:{
			System.out.println(x*y);
			//break;
		}
		case 4:{
			float m= (float)x/y;
			System.out.println(m);
		//	break;
		}
		case 5:{
			if(x<0 || y<0) {
				System.out.println("Enter Non-Negative Integers");
				throw new nonNegativeException();
			}
			int sum=1;
			for(int i=0;i<y;i++) {
				sum=sum*x;
			}
			System.out.println(sum);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + z);
		}
		
	}

	public static void main(String[] args) throws nonNegativeException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = s.nextInt();
		System.out.println("Enter Second number");
		int y = s.nextInt();
		System.out.println("Enter the operation");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multipilcation");
		System.out.println("4. Division");
		System.out.println("5. Power");
		int z = s.nextInt();
		calc(x, y, z);

	}

}

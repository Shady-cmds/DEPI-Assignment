
package e;

import java.util.Scanner;

	public class gcd{
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt(); 
	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();	       
	        if (num1 < num2) {
	            int temp = num1;
	            num1 = num2;
	            num2 = temp;
	        }	        	       
	        int gcd = 1;
	        while (num2 != 0) {
	            int temp = num2;
	            num2 = num1 % num2;
	            num1 = temp;
	        }

	        gcd = num1;
	        
	        System.out.println("The GCD is: " + gcd);
	        
	        scanner.close();
	    }
	}
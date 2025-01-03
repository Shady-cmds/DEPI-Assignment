
package e;

import java.util.Scanner;

	public class primenum{
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();	      
	        boolean isPrime = true;
	        int i = 2;	       	       
	        if (number < 2) {
	            isPrime = false;
	        } else {
	            
	            while (i <= Math.sqrt(number)) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break; 
	                }
	                i++; 
	            }
	        }
	             
	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	        
	        scanner.close();
	    }
	}
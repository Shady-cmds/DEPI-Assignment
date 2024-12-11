
package e;

import java.util.Scanner;

	public class digitnum {
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        long number = scanner.nextLong();
	        int count = 0;
	        
	        number = Math.abs(number);
	        
	        if (number == 0) {
	            count = 1;
	        } else {

	            while (number > 0) {
	                number /= 10;
	                count++;
	        }
	        
	        System.out.println("Number of digits: " + count);
	        
	        scanner.close();
	    }
		}
	}

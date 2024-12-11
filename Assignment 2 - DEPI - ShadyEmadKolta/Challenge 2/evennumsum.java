
package e;

import java.util.Scanner;

	public class evennumsum{
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number:");
	        int N = scanner.nextInt();
	        int sum = 0;
	        int i = 1;

	        while (i <= N) {
	            if (i % 2 == 0) {
	                sum += i;
	            }
	            i++;
	        }
	        
	        System.out.println("The sum of all even numbers between 1 and " + N + " is: " + sum);
	        
	        scanner.close();
	    }
	}
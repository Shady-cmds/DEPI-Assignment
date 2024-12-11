
package e;

import java.util.Scanner;

	public class binarydecimal{
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);	        
	        System.out.print("Enter a binary number: ");
	        String binaryString = scanner.nextLine();	        
	        int decimalNumber = 0;
	        int length = binaryString.length();
	        int i = 0;
	        while (i < length) {
	            char binaryDigit = binaryString.charAt(length - 1 - i);
	            int digitValue = Character.getNumericValue(binaryDigit);
	            decimalNumber += digitValue * Math.pow(2, i);
	            i++;
	        }
	        System.out.println("The decimal equivalent of binary " + binaryString + " is: " + decimalNumber);	        
	        scanner.close();
	    }
	}
package depi;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fac = 1;p
            for (int x = 1; x <= num; x++) {
                fac *= i;
            }
            System.out.println("factorial of " + num + " is " + fac);
        }r
        scanner.close();
    }
}
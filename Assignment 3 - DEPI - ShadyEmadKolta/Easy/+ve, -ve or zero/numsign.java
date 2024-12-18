package depi;
import java.util.Scanner;
public class numsign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double x = scanner.nextDouble();
        if (x > 0) {
            System.out.println("num is positive.");
        } else if (x < 0) {
            System.out.println("num is negative.");
        } else {
            System.out.println("num is zero.");
        }
        scanner.close();
    }
}
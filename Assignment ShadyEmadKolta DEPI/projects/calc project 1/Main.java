
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        double result;
        System.out.print("Enter the operation: 1.(+) 2.(-) 3.(x) 4.(/): ");
        int operation = sc.nextInt();

        if (operation == 1) {
            result = num1 + num2;
            System.out.println("The Result of the sum is " + result);
        } else if (operation == 2) {
            result = num1 - num2;
            System.out.println("The Result of the subtraction is " + result);
        } else if (operation == 3) {
            result = num1 * num2;
            System.out.println("The Result of the multiplication is " + result);
        } else if (operation == 4) {
            result = num1 / num2;
            System.out.println("The Result of the division is " + result);
        } else {
            System.out.println("Invalid operation.")

        sc.close();
    }
}
// calc project
package depi;
import java.util.Scanner;
public class lagernum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("first number: ");
        int x = scanner.nextInt();
        System.out.print("second number: ");
        int y = scanner.nextInt();
        if (x > y) {
            System.out.println( x + "is bigger");
        } else if (y > x) {
            System.out.println(y + "is bigger");
        } else {
            System.out.println("both are equal");
        }
        scanner.close();
    }
}
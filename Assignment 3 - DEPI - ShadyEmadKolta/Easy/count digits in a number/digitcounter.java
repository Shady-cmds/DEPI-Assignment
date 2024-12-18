package depi;
import java.util.Scanner;
public class digitcounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);r
        System.out.print("number: ");
        long n = scanner.nextLong();
        int x = 0;
        if (n == 0) {
            x = 1;
        } else {
            n = Math.abs(n);
            while (n > 0) {
                n /= 10;
                x++;
            }
        }
        System.out.println("number of digits = : " + x);
        scanner.close();
    }
}
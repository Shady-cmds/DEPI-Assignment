package e;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("enter num: ");
        int num = scanner.nextInt();
        int R,digit = 0;     
        while (num != 0) {
            digit = num % 10;
            R = R * 10 + digit;
            num /= 10;
        }
        System.out.println("Output: Reversed = " + R);
    }
}
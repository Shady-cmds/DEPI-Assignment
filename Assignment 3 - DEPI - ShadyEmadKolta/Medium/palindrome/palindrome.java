package depi;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        if (isPalindrome(number)) {
            System.out.println(num + " is palindrome.");
        } else {
            System.out.println(num + " is not palindrome.");
        }
        scanner.close();
    }
    public static boolean isPalindrome(int num) {
        int original = num;
        int re = 0;
        if (num < 0) {
            return false;
        }
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return original == re;
    }
}
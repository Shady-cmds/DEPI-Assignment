
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char L = sc.next().charAt(0);

        if (L == 'a' || L == 'e' || L == 'i' || L == 'o' || L == 'u' || L == 'A' || L == 'E' || L == 'I' || L == 'O' || L == 'U')
        {
            System.out.println("Letter " + L + " is a vowel.");
        }
        else if (L != 'a' || L != 'e' || L != 'i' || L != 'o' || L != 'u' || L != 'A' || L != 'E' || L != 'I' || L != 'O' || L != 'U')
        {
            System.out.println("Letter " + L + " is not a vowel.");
        }
        else
        {
            System.out.println("Invalid letter!");
        }

        sc.close();
    }
}
//vowel project
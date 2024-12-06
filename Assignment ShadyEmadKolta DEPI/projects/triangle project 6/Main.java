//Triangle checker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("First side: ");
        double side1 = sc.nextDouble();
        System.out.print("Second side: ");
        double side2 = sc.nextDouble();
        System.out.print("Third side: ");
        double side3 = sc.nextDouble();


        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
        {
            System.out.println("Error, invalid input");
        }
        else if (side1 > (side2 + side3) || side2 > (side3 + side1) || side3 > (side1 + side2))
        {
            System.out.println("This is a triangle");
        }
        else
        {
            System.out.println("This is not a triangle");
        }

        sc.close();
    }
}
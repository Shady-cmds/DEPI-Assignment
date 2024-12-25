import java.util.Arrays;
public class largest2ndnum {
    public static int z(int[] arr) {
        int x = Integer.MIN_VALUE, y= Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > x) {
                y = x;
                x = n;
            } else if (n > y && n != x) {
                y= n;
            }
        }
        return (y == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int[] arr = {78, 21, 57, 92, 66};
        int largest2nd = z(arr);
        System.out.println("2bd lergest num = " + largest2nd);
    }
}
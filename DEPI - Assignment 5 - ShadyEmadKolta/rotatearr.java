import java.util.Arrays;
public class rotatearr {
    public static void r(int[] a, int k) {
        k = k % a.length;
        reverse(a, 0, a.length - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
    }
    private static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int t = a[start];
            a[start] = a[end];
            a[end] = t;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 2;
        r(a, k);
        System.out.println("Array after rotation = " + Arrays.toString(a));
    }
}
package depi;
public class arraylength {
    public static void main(String[] args) {
        int[] x = {22, 58, 83, 31, 77};
        int length = x.length;
        System.out.println(" array length is: " + length);
        System.out.println(" array numbers are: ");
        for (int y = 0; y < length; y++) {
            System.out.println(x[y]);
        }
    }
}
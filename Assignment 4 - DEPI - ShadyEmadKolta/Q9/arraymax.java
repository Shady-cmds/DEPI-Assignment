package depi;
public class arraymax {
    public static void main(String[] args) {
        int[] x = {22, 58, 83, 31, 77};
        int z = x[0];
        for (int y = 1; y < x.length; y++) {
            if (x[y] > z) {
                z = x[y];
            }
        }
        System.out.println("array max is: " + z);
    }
}
package depi;
public class arraydefaultvalue {
    public static void main(String[] args) {
        int[] x = new int[5];
        System.out.println("Default values of array:");
        for (int y= 0; y < x.length; y++) {
            System.out.println("number " + y + ": " + x[y]);
        }
    }
}
public class copyarr {
    public static void main(String[] args) {
        int[] x1 = {9, 8, 7, 6, 5};
        int[] x2 = new int[x1.length];
        for (int i = 0; i < x1.length; i++) {
            x2[i] = x1[i];
        }
        System.out.println("the copied array is: ");
        for (int y : x2) {
            System.out.print(y + " ");
        }
    }
}
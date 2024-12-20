package depi;
public class arraymatrix {
    public static void main(String[] args) {
        int[][] x = {
            {6, 7, 4},
            {1, 9, 8},
            {3, 5, 2}
        };
        System.out.println("matrix nums are:");
        for (int y = 0; y < x.length; y++) {
            for (int k = 0; k < x[y].length; k++) {
                System.out.print(x[y][k] + " ");
            }
            System.out.println();
        }
    }
}
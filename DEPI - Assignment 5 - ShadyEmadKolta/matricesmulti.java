import java.util.Arrays;
public class matricesmulti {
    public static void main(String[] args) {
        int[][] x = {
            {6, 8},
            {4, 5}
        };
        int[][] y = {
            {2, 7},
            {3, 9}
        };
        int[][] z = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    z[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("result of matrices=");
        for (int[] row : z) {
            for (int n : row) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}

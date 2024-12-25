public class transpose {
    public static void main(String[] args) {
        int[][] x = {
            {5, 9, 6},
            {7, 1, 3},
            {4, 2, 8}
        };
        int[][] y = new int[x[0].length][x.length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                y[j][i] = x[i][j];
            }
        }=
        for (int[] r : y) {
            for (int n : r) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
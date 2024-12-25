public class jaggedarr {
    public static void main(String[] args) {
        int[][] x = {
            {82, 65, 11},
            {7, 26},
            {74, 66, 12, 28}
        };
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
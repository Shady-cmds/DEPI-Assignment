public class diagonal {
    public static void main(String[] args) {
        int[][] x = {
			{82, 65, 11},
            {7, 28, 26},
            {74, 66, 12}
        };
        System.out.println("Diagonal nums:");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i][i]);
        }
    }
}
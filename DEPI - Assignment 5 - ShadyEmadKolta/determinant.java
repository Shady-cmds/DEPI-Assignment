public class determinant {
    public static int a(int[][] x) {
        return x[0][0] * (x[1][1] * x[2][2] - x[1][2] * x[2][1]) -
               x[0][1] * (x[1][0] * x[2][2] - x[1][2] * x[2][0]) +
               x[0][2] * (x[1][0] * x[2][1] - x[1][1] * x[2][0]);
    }
    public static void main(String[] args) {
        int[][] x = {
			{8, 6, 4},
			{1, 3, 7},
			{9, 2, 5}
        };
        int b = calculateDeterminant(x);
        System.out.println("Determinant of the x is: " + b);
    }
}
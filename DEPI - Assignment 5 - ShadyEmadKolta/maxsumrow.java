	import java.util.HashSet;
	public class maxsumrow {
		public static void main(String[] args) {
			int[][] a = {
				{8, 6, 4},
				{1, 3, 7},
				{9, 2, 5}
			};
			int mrow = 0;
			int msum = Integer.MIN_VALUE;
			for (int i = 0; i < a.length; i++) {
				int sum = 0;
				for (int j = 0; j < a[i].length; j++) {
					sum += a[i][j];
				}
				if (sum > msum) {
					msum = sum;
					mrow = i;
				}
			}
			System.out.println("Row with max sum is " + mrow + " and it's sum is " + msum);
		}
	}

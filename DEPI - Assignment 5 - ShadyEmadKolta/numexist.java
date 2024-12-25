
public class numexist {
    public static boolean e(int[] a, int n) {
        for (int x : a) {
            if (x == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a = {7, 52, 3, 22, 84};
        int ncheck = 3;
        System.out.println("number " + ncheck + " exists: " + e(a, ncheck));
    }
}

import java.util.HashMap;
public class count 
	public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
		HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int key : countMap.keySet()) {
            System.out.println("Number " + key + " occurs " + countMap.get(key) + " times.");
        }
    }
}
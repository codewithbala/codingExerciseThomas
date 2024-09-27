import java.util.HashMap;

public class Twentieth {
   // Write a program to find the duplicate elements in an array.
    public static void duplicates(int[] nums){
        HashMap<Integer,Integer> counts = new HashMap<>();

        for (int i : nums) {
            if (counts.containsKey(i) && counts.get(i) == 1) System.out.println(i);
            counts.put(i,counts.getOrDefault(i,0)+1);
        }
    }
}

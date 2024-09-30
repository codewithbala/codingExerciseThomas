import java.util.ArrayList;
import java.util.HashMap;

public class Twentieth {
   // Write a program to find the duplicate elements in an array.
    public static void duplicates(int[] nums){
        HashMap<Integer,Integer> counts = new HashMap<>();
        ArrayList<Integer> duplicateEntries = duplicateList(nums);
        for (int i : duplicateEntries) {
            System.out.println(nums[i]);
        }
    }

    public static ArrayList<Integer> duplicateList(int[] nums) {
        HashMap<Integer,Integer> counts = new HashMap<>();
        ArrayList<Integer> indicies = new ArrayList<>();

        for (int i : nums) {
            if (counts.containsKey(i)) indicies.add(i);
            counts.put(i,counts.getOrDefault(i,0)+1);
        }

        return indicies;
    }
}

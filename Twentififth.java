import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Twentififth {
    //Write a program to find the union of two arrays.
    public static List<Integer> union(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mp = Twentisecond.frequency(nums1);

        for (int i : nums2) {
            mp.put(i, mp.getOrDefault(i,0)+1);
        }

        return new ArrayList<>(mp.keySet());
    }
}

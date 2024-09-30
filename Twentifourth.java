import java.util.*;
import java.util.stream.Collectors;

public class Twentifourth {
    //Write a program to find the intersection of two arrays.
    public static List<Integer> intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mp1 = Twentisecond.frequency(nums1);
        Map<Integer, Integer> mp2 = Twentisecond.frequency(nums2);
        ArrayList<Integer> ans = new ArrayList<>();

        for (Map.Entry<Integer,Integer> mapElement : mp1.entrySet()) {
            for (int i = 1; i <= Math.abs(mapElement.getValue()-mp2.get(mapElement.getKey())); i++) {
                ans.add(mapElement.getKey());
            }
        }

        return ans;
    }

}

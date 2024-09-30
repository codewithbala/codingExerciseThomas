import java.util.HashMap;
import java.util.Map;

public class Twentisecond {
    //Write a program to count the frequency of elements in an array.
    public static Map<Integer,Integer> frequency (int[] nums) {
        Map<Integer,Integer> frequencies = new HashMap<>();

        for (int i : nums) {
            frequencies.put(i, frequencies.getOrDefault(i,0)+1);
        }

        return frequencies;
    }

}

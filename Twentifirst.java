import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class Twentifirst {
    //Write a program to remove duplicates from an array.
    public static int[] removeDuplicates(int[] nums){
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);

        int[] ans = new int[set.size()];
        int index = 0;
        for (int i : set) {
            ans[index++] = i;
        }

        return ans;
    }

}

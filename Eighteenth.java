public class Eighteenth {
    //Write a program to check if an array is sorted.
    public static boolean isSorted(int[] nums){
        if (nums.length == 0 || nums.length == 1) return true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) return false;
        }

        return true;
    }
}

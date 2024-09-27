public class Nineteenth {
    //Write a program to rotate an array by k positions.
    public static int[] rotate(int[] nums, int k){
        if (nums == null) throw new IllegalArgumentException("Invalid array");
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[(i+k) % nums.length] = nums[i];
        }
        return ans;
    }
}

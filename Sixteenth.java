public class Sixteenth {
    //Write a program to find the second largest element in an array.
    public static int secondLargest(int[] nums) {
        int max = Fifteenth.largest(nums);
        int ans = Integer.MIN_VALUE;

        for (int i : nums) {
            if (i > ans && i != max) ans = i;
        }

        return ans;
    }

}

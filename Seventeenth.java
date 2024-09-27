public class Seventeenth {
    //Write a program to find the missing number in an array of 1 to n.
    public static int missing(int[] nums) {
        int sum = 0;
        if (nums.length == 0 || nums == null) throw new IllegalArgumentException("Invalid array");
        int expected = nums.length == 1 ? 1 : (nums.length + 1) * (nums.length+2)/2;

        for (int i : nums) {
            sum += i;
        }

        return expected - sum;
    }

}

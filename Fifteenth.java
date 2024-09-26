public class Fifteenth {
    //Write a program to find the largest element in an array.
    public static int largest(int[] nums) {
        if (nums == null) throw new IllegalArgumentException("Need valid array");
        int max = Integer.MIN_VALUE;

        for (int i : nums) {
            max = Math.max(i, max);
        }

        return max;
    }
}

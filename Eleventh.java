public class Eleventh {
    //Write a program to reverse an integer.
    public static int reverse(int i) {
        StringBuilder num = new StringBuilder(String.valueOf(i));
        num.reverse();
        int ans = 0;
        try {
            ans = Integer.parseInt(num.toString());
        } catch (Exception e) {
            throw new RuntimeException("Reversed number too big/too small");
        }
        return ans;

    }
}

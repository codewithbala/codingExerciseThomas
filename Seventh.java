public class Seventh {
    //Write a program to find the greatest common divisor (GCD) of two numbers.
    public static int gcd(int n1, int n2) {
        if (n1 == 0) return n2;
        if (n2 == 0) return n1;

        int min = Math.min(n1, n2);
        int max = min == n1 ? n2 : n1;
        return gcd(min,max % min);
    }

}

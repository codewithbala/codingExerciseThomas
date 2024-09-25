public class Eighth {
    //Write a program to find the least common multiple (LCM) of two numbers.
    public int lcm(int n1, int n2) {
        return n1 * n2 / Seventh.gcd(n1,n2);
    }

}

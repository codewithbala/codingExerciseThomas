public class Thirteenth {
    //Write a program to find the sum of digits of an integer.
    public static int sumDigits (int i) {
        return i == 0 ? 0 : i % 10 + sumDigits(i/10);
    }
}

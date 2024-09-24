public class Third {

    //Write a program to find the factorial of a number.
    public int factorial (int n) {
        if (n < 0) throw new IllegalArgumentException("Cannot find factorial of negative number");
        if (n <= 1) return 0;

        return n*factorial(n-1);
    }


}

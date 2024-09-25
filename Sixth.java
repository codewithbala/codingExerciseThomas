import java.util.ArrayList;
import java.util.List;

public class Sixth {
    //Write a program to print the first n prime numbers.
    public static void prime (int n) {
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        int num = 3;
        while (primes.size() < n) {
            boolean is_prime = true;
            for (int i = 0; i < primes.size(); i++) {
                if (num % primes.get(i) == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) primes.add(num);
            num += 2; // Check the next odd number (since even numbers other than 2 are not prime)
        }
        for (int i = 0; i < primes.size(); i++) System.out.print(primes.get(i) + " ");
        System.out.println();
    }
}

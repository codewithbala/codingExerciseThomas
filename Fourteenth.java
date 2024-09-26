public class Fourteenth {
    //Write a program to print the factors of a number.
    public static void factors (int i) {
        if (i == 0) System.out.println(0);
        for (int num = 1; num < Math.sqrt(i); i++) {
            if (i % num == 0){
                System.out.println(num);
                if (num*num != i) System.out.println(i/num);
            }
        }
    }
}

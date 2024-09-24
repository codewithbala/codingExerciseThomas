public class Fourth {
    //Write a program to find the Fibonacci sequence up to n terms.
    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;

        return fibonacciHelper(n-2, 1,1);
    }

    int fibonacciHelper(int count, int currNum, int prevNum){
        if (count == 0) return currNum;
        return fibonacciHelper(count-1, currNum+prevNum, currNum);
    }

}

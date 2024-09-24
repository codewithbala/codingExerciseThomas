public class First {

    //Write a program to reverse a string.
    public String reverse (String s) {
        StringBuilder ans = new StringBuilder(s);
        ans.reverse();
        return String.valueOf(ans);
    }
}

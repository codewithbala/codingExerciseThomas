public class Second {

    //Write a program to check if a string is a palindrome.
    public boolean palindrome (String s) {
        if (s.length() <= 1) return true;
        int index1 = 0;
        int index2 = s.length()-1;

        while (index1 < index2) {
            if (s.charAt(index1) != s.charAt(index2)) {
                return false;
            }
            index1++;
            index2++;
        }
        return true;
    }
}

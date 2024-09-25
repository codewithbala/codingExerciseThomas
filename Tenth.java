public class Tenth {
    //Write a program to count the number of vowels in a string.
    public static int vowels (String s) {
        int ans = 0;

        for (char c: s.toCharArray()){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ans++;
        }
        return ans;
    }
}

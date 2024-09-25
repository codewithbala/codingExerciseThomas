import java.util.HashMap;

public class Ninth {
    //Write a program to check if two strings are anagrams.
    public boolean anagram (String s1, String s2) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : s1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        for (int count : charCount.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}

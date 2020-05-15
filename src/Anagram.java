import java.util.Arrays;

public class Anagram {

    public static void main (String[] args) {
        String s = "anaram", t = "nagaram";
        Anagram.isAnagram(s, t);

    }
    // Solution for https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] tempS = s.toCharArray();
        char[] tempT = t.toCharArray();
        Arrays.sort(tempS);
        Arrays.sort(tempT);
        return Arrays.toString(tempS).equals(Arrays.toString(tempT));
    }


}

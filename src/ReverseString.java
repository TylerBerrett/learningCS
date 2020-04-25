import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] test = {'h','e','l','l','o'};
        char[] test1 = {'T','y','l','e','r'};
        char[] test2 = {'H','a','n','n','a','h'};
        char[] test3 = {'B','E','R','r','E','T', 't'};
        System.out.println(ReverseString.reverseString(test3));

    }
    // Solution for https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
    public static char[] reverseString(char[] s) {
        // two pointers one at start and one at end and swap and meet in middle
        int j = s.length - 1;
        for (int i = 0; i < s.length / 2; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

        }
        return s;
    }

}

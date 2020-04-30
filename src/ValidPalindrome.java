public class ValidPalindrome {

    public static void main(String[] args) {
        String test = "A man, a plan, a canal: Panama";
        String test1 = "tyler........";
        System.out.println(ValidPalindrome.isPalindrome(test1));

    }

    // Solution for https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
    public static boolean isPalindrome(String s) {
        String filter = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int j = filter.length() - 1;
        for (int i = 0; i < filter.length() / 2; i++, j--) {
            if (filter.charAt(i) != filter.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}

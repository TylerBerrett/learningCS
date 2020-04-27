import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] test = {8,9,9,9};
        System.out.println(Arrays.toString(PlusOne.plusOne(test)));
    }

    // Solution for https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        if (digits[digits.length - 1] == 9) {
            while (digits[i] >= 9) {
                if (i > 0) {
                    if (i != digits.length - 1) {
                        if (digits[i + 1] == 0 && digits[i] == 9) {
                            break;
                        }
                    }
                    digits[i] = 0;
                    digits[--i]++;
                }
                else {
                    if (digits[0] == 9 && digits.length > 1) {break;}
                    int[] longerDigits = Arrays.copyOf(digits, digits.length + 1);
                    longerDigits[0] = 1;
                    return longerDigits;
                }
            }
        }
        else {
            digits[digits.length - 1]++;
        }
        return digits;
    }
}

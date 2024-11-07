
import java.util.Arrays;

// LC 66 : Plus One
public class LC66 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits1 = { 1, 2, 3 };
        int[] digits2 = { 4, 3, 2, 1 };
        int[] digits3 = { 9 };

        System.out.println(Arrays.toString(plusOne(digits1))); // [1, 2, 4]
        System.out.println(Arrays.toString(plusOne(digits2))); // [4, 3, 2, 2]
        System.out.println(Arrays.toString(plusOne(digits3))); // [1, 0]
    }
}

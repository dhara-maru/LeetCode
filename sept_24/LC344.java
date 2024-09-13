
public class LC344 {

    public void reversestring(char s[]) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String a[]) {

        LC344 ans = new LC344();
        char s[] = {'D', 'H', 'A', 'R', 'A'};

        ans.reversestring(s);
        System.out.println("reverse string - " + String.valueOf(s));

    }
}

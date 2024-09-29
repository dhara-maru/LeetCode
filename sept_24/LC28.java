
import java.util.Scanner;

public class LC28 {

    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        int haystacklength = haystack.length();
        int needlelength = needle.length();

        if (needlelength > haystacklength) {
            return -1;
        }

        for (int i = 0; i <= haystacklength - needlelength; i++) {
            int j = 0;
            while (j < needlelength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needlelength) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter haystack word : ");
        String haystack = sc.next();
        System.out.print("Enter needle word : ");
        String needle = sc.next();

        LC28 obj = new LC28();

        int answer = obj.strStr(haystack, needle);
        System.out.println(answer);

    }

}

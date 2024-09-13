//LC 58 - length of the last word

import java.util.Scanner;

class LC58 {

    public static int lastlength(String s) {
        int length = 0;
        int last = s.length() - 1;

        //while last is available or char at last is space then move backwards --
        while (last >= 0 && s.charAt(last) == ' ') {
            last--;
        }

        //while last is available or char at last is NOT space then move backwards and add length count.
        while (last >= 0 && s.charAt(last) != ' ') {
            length++;
            last--;
        }

        return length;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        LC58 ans = new LC58();

        System.out.println("Enter a string - ");
        String s = sc.nextLine();

        int len = lastlength(s);
        System.out.println(len);

    }

}

//LC204 : Count Primes

import java.util.*;

class LC204 {

    public int countPrimes(int n) {
        int count = 0;

        for (int i = 2; i < n; i++) {
            boolean prime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        LC204 sol = new LC204();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit number : ");
        int n = sc.nextInt();

        int result = sol.countPrimes(n);
        System.out.println("There are " + result + " prime numbers below " + n);
    }
}

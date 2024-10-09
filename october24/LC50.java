// LC50 : Pow(x,n)

public class LC50 {

    public double myPow(double x, int n) {

        if (n == Integer.MIN_VALUE) {
            if (x == 1.0) {
                return 1.0; // 1 raised to any power is 1

            }
            if (x == -1.0) {
                return 1.0; // -1 raised to an even power is 1

            }
            return 0;
        }
        if (n < 0) {

            x = 1 / x;
            n = -n;

        }
        double result = 1.0;
        while (n > 0) {
            if ((n & 1) == 1) { // If n is odd
                result *= x; // Multiply the result by x
            }
            x *= x; // Square x
            n >>= 1; // Divide n by 2
        }
        return result;
    }

    public static void main(String args[]) {
        LC50 sol = new LC50();
        double x = 20.0;
        int n = 3;
        double result = sol.myPow(x, n);
        System.out.println("Power is : " + result);
    }
}

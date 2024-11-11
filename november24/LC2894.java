// LC 2894 : Divisible and Non-divisible Sums Difference
public class LC2894 {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m != 0) {
                num1 += i;
            } else if (i % m == 0) {
                num2 += i;
            }
        }
        return num1 - num2;
    }

    public static void main(String[] args) {
        LC2894 sol = new LC2894();
        System.out.println(sol.differenceOfSums(10, 3));
        System.out.println(sol.differenceOfSums(5, 6));
        System.out.println(sol.differenceOfSums(5, 1));
    }
}

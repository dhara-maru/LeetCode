
// LC 1431 : Kids With the Greatest Number of Candies
import java.util.*;

public class LC1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> reslist = new ArrayList<>();
        int maxcandies = 0;

        for (int i = 0; i < candies.length; i++) {
            maxcandies = Math.max(maxcandies, candies[i]);
        }

        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= maxcandies) {
                reslist.add(true);
            } else {
                reslist.add(false);
            }
        }
        return reslist;
    }

    public static void main(String[] args) {
        LC1431 sol = new LC1431();
        int candies[] = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        System.out.println(sol.kidsWithCandies(candies, extraCandies));
    }
}
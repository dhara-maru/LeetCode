// LC 2798 : Number of Employees Who Met the Target
public class LC2798 {
    public int countEmpsWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] hours = { 4, 6, 3, 67, 7, 2, 1, 2, 3 };
        int target = 3;
        LC2798 sol = new LC2798();
        System.out
                .println("Number of Employees who met the target hours : " + sol.countEmpsWhoMetTarget(hours, target));

    }
}
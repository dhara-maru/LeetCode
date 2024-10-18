//LC 1480 : Running sum of 1D array
public class LC1480 {
    public int[] runningSum(int[] nums) {
        int[] runningsum = new int[nums.length];
        runningsum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            runningsum[i] = (runningsum[i - 1] + nums[i]);
        }

        return runningsum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        LC1480 obj = new LC1480();
        int[] answerarray = obj.runningSum(nums);
        for (int i = 0; i < answerarray.length; i++) {
            System.out.print(answerarray[i] + "\t");
        }

    }

}

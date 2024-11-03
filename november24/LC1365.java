// LC 1365 : How Many Numbers Are Smaller Than the Current Number
public class LC1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answerArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;

                }
                answerArray[i] = count;
            }
        }
        return answerArray;
    }

    public static void main(String[] args) {
        LC1365 sol = new LC1365();
        int[] nums = { 8, 4, 6, 2, 5, 8, 2, 0 };
        int[] result = sol.smallerNumbersThanCurrent(nums);

        System.out.print("Output: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\t");
        }
    }
}

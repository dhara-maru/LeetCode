
//LC 283 : Move Zeros
import java.util.*;
// USING ARRAYLIST 
// class LC283 {

//     public void moveZeroes(int[] nums) {
//         ArrayList<Integer> nonzerolist = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != 0) {
//                 nonzerolist.add(nums[i]);
//             }
//         }

//         int zerosNeeded = nums.length - nonzerolist.size();
//         for (int i = 0; i < zerosNeeded; i++) {
//             nonzerolist.add(0);
//         }

//         System.out.print("[");
//         for (int i = 0; i < nonzerolist.size(); i++) {
//             System.out.print(nonzerolist.get(i));
//             if (i < nonzerolist.size() - 1) {
//                 System.out.print(",");
//             }
//         }
//         System.out.print("]");
//     }

//     public static void main(String[] args) {
//         LC283 sol = new LC283();
//         int[] nums = { 0, 1, 0, 3, 12 };
//         sol.moveZeroes(nums);

//     }
// }

class LC283 {

    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        LC283 sol = new LC283();
        int[] nums = { 0, 1, 0, 3, 12 };
        sol.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}

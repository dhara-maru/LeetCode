//LC35 : Search Insert Position

import java.util.Arrays;
import java.util.Scanner;

public class LC35 {

    public int searchInsert(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;

            }
        }
        return low;
    }

    public static void main(String[] args) {
        LC35 sol = new LC35();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array :");
        int size = sc.nextInt();
        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        for (int i = 0; i < size; i++) {    //printing sorted arraay
            System.out.println(nums[i] + "\t");
        }

        System.out.print("Enter the target element : ");
        int target = sc.nextInt();

        int ans = sol.searchInsert(nums, target);
        System.out.println(ans);
    }
}

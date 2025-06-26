package leetcode.RemoveDuplicates;
import java.util.*;

public class RemoveDuplicates {

    // ===== Paste your solution here =====
    static class Solution {
        public int removeDuplicates(int[] nums) {
            Set<Integer> seenSet = new TreeSet<Integer>();
            for (int ele: nums){
                // System.out.println(ele);
                seenSet.add(ele);
            }

            int k = seenSet.size();

            for (int i = 0; i < nums.length; i++){
                nums[i] = 0;
            }

            int i = 0;
            for (int ele: seenSet){
                System.out.println(ele);
                nums[i] = ele;
                i++;
            }

            return k;
        }
    }
    // ====================================

    public static void main(String[] args) {
        Solution sol = new Solution();

        // === Sample input ===
        int[] nums = {-3,-1,0,0,0,3,3};

        // === Call the function ===
        int k = sol.removeDuplicates(nums);

        // === Print result ===
        System.out.println("Length after removing duplicates: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}

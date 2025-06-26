package leetcode.RotateArray;

import java.util.*;

public class RotateArray {

    // ===== Paste your solution here =====
    static class Solution {
        // Rotate the array to the right by k steps, in-place
        public void rotate(int[] nums, int k) {
            int[] numsCopy = nums.clone();

            for (int i = 0; i < nums.length; i++){
                nums[(i + k) % nums.length] = numsCopy[i];
            }
        }
    }
    // ====================================

    public static void main(String[] args) {
        Solution sol = new Solution();

        // === Sample input ===
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        // === Call the function ===
        sol.rotate(nums, k);  // In-place modification

        // === Print output ===
        System.out.println("Rotated array: " + Arrays.toString(nums));
    }
}

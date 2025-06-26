package leetcode.LongestConsecSequence;

import java.util.TreeSet;

public class LongestConsecSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        TreeSet<Integer> numsTreeSet = new TreeSet<>();

        for (int ele: nums){
            numsTreeSet.add(ele);
        }

        int consecCount = 1;
        int maxConsecCount = 1;
        int prevEle = numsTreeSet.first();
        for (int ele: numsTreeSet){
            if (ele == prevEle){
                continue;
            }
            
                System.out.println(ele);
            if (ele == prevEle + 1){
                consecCount++;
                maxConsecCount = Integer.max(consecCount, maxConsecCount);
            }
            else{
                consecCount = 1;
            }
            
            prevEle = ele;
        }
        
        return maxConsecCount;
    }

    public static void main(String[] args) {
        LongestConsecSequence sol = new LongestConsecSequence();

        // Example test cases
        int[] nums2 = {100,4,200,1,3,2};

        System.out.println("Test case 2: " + sol.longestConsecutive(nums2)); // Expected: 9
    }
}

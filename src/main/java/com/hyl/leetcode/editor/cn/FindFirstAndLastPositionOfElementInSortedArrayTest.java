package com.hyl.leetcode.editor.cn;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int []nums = new int[]{5,7,7,8,8,10};
        int target = 6;
        System.out.println(Arrays.toString(solution.searchRange(nums,target)));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (nums[middle] == target) {
                int leftIndex = middle;
                int rightIndex = middle;
                while (leftIndex >= 0 && nums[leftIndex] == target) {
                    leftIndex--;
                }
                while (rightIndex < nums.length && nums[rightIndex] == target) {
                    rightIndex++;
                }
                return new int[]{leftIndex + 1, rightIndex - 1};
            }

            if(nums[left]<=nums[middle]){
                if(nums[left]<=target && target<nums[middle]){
                    right = middle - 1;
                }else{
                    left = middle + 1;
                }
            }else {
                if (nums[middle]<target&& target<=nums[right]){
                    left = middle + 1;
                }else{
                    right = middle -1;
                }
            }
        }

        return new int[]{-1, -1};

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



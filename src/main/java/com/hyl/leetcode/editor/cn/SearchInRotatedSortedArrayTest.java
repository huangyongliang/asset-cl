package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class SearchInRotatedSortedArrayTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int result = solution.search(nums, target);
        System.out.println(result);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (nums[middle] == target) {
                return middle;
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

        return -1;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



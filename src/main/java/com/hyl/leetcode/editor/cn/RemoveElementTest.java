package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class RemoveElementTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int length = solution.removeElement(nums, val);
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int removeElement(int[] nums, int val) {

            int i = 0;
            int j = nums.length - 1;
            while (i <= j) {
                if (nums[i] == val) {
                    swap(nums, i, j);
                    j--;
                } else {
                    i++;
                }
            }
            return j + 1;
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}



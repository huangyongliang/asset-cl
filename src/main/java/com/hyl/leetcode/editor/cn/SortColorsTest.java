package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class SortColorsTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[] nums = {2,0,2,1,1,0};
        solution.sortColors(nums);
        for (int num : nums) {
            System.out.print(num);
        }
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;
        int p0 = 0, p1 = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[p1];
                nums[p1] = temp;
                ++p1;
            } else if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = temp;
                if (p0 < p1) {
                    temp = nums[i];
                    nums[i] = nums[p1];
                    nums[p1] = temp;
                }
                ++p0;
                ++p1;
            }
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



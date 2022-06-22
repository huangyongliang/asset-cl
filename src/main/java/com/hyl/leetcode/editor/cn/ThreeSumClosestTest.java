package com.hyl.leetcode.editor.cn;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ThreeSumClosestTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[] nums = {-1,2,1,-4};
        System.out.println(solution.threeSumClosest(nums, 1));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    return sum;
                }

                if (Math.abs(sum - target) < diff) {
                    diff = Math.abs(sum - target);
                    result = sum;
                }
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }

            }
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



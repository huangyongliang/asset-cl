package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(height));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {

            int max = 0;
            int left = 0;
            int right = height.length - 1;
            while (left < right) {
                int area = (right - left) * Math.min(height[left], height[right]);
                if (area > max) {
                    max = area;
                }
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
            return max;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class ZVAVXXTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int [] nums = {1,1,1};
        int k  = 1;
        int i = solution.numSubarrayProductLessThanK(nums, k);
        System.out.println(i);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k==0) return 0;

        int result = 0;
        int left = 0;
        int right = 0;
        int sum = 1;
        while (right < nums.length){
            sum *= nums[right];
            while(sum>=k && left<=right){
                sum /= nums[left];
                left++;
            }
            result += right-left+1;
            right++;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



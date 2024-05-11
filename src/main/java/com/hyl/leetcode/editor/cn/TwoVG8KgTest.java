package com.hyl.leetcode.editor.cn;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TwoVG8KgTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int [] numbers = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(Arrays.toString(numbers));
        System.out.println(target);
        int i = solution.minSubArrayLen(target, numbers);
        System.out.println(i);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        while (right < nums.length){
            sum += nums[right];
            while(sum>=target){
                result = Math.min(result,right-left+1);
                sum -=nums[left];
                left++;
            }
            right++;
        }
        return result==Integer.MAX_VALUE ? 0 :result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



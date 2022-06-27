package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class JumpGameTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[]nums = new int[]{3,2,1,0,4};
        System.out.println( solution.canJump(nums));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        boolean canJump = false;
        for (int i = 0; i < nums.length ; i++) {
            if (i<=max){
                max = Math.max(max, nums[i] + i);
                if (max>=nums.length-1){
                    return true;
                }
            }else{
                return false;
            }
        }
        return canJump;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



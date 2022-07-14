package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class QueShiDeShuZiLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int missingNumber(int[] nums) {
        int result = -1;
        for (int i = 0 ;i <nums.length;i++){
            result++;
            if (nums[i]!=result){
                return result;
            }
        }
        return ++result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class WGki4KTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[] nums = {2323,2323,9384,2323};
        int res = solution.singleNumber(nums);
        System.out.println(res);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0 ;
        for (int i=1;i<=32;i++){
            int count = 0;
            for (int num : nums) {
                count+= num>>i & 1;
            }
            if (count%3==1){
                res |= (1<<i);
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



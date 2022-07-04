package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class XuanZhuanShuZuDeZuiXiaoShuZiLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4};
        System.out.println(solution.minArray(nums));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minArray(int[] numbers) {
        if (numbers.length==0) {
            return 0;
        }
        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]<result) {
                result = numbers[i];
            }
        }
        return result;
    }




}
//leetcode submit region end(Prohibit modification and deletion)

}



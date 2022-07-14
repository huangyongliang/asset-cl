 package com.hyl.leetcode.editor.cn;

 import org.junit.jupiter.api.Test;

 public class GuPiaoDeZuiDaLiRunLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[] prices ={7,6,4,3,1};
        System.out.println(solution.maxProfit(prices));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {

        if (prices.length<2)
            return 0;

        int lastMin;
        int profits = 0;

        lastMin = prices[0];
        for (int i =1;i<prices.length;i++){
            if (prices[i]>lastMin){
                profits = Math.max(profits,prices[i]-lastMin);
            }else {
                lastMin = prices[i];
            }

        }

        return profits;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



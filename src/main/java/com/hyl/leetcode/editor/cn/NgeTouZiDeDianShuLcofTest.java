package com.hyl.leetcode.editor.cn;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class NgeTouZiDeDianShuLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        double[] doubles = solution.dicesProbability(3);
        System.out.println(Arrays.toString(doubles));
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double[] dicesProbability(int n) {

        double[] one = new double[6];
        Arrays.fill(one, 1/6.0);
        if (n == 1) {
            return one;
        }
        double[] pre = one;
        for (int i = 2; i <= n; i++) {
            double[] cur = new double[5*i+1];
            for (int j = 0;j<pre.length;j++){
                for(int k=0;k<one.length;k++){
                    cur[j+k] += pre[j]*one[k];
                }
            }
            pre = cur;
        }
        return pre;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



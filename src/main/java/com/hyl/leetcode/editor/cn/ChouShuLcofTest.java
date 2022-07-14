package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class ChouShuLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        System.out.println(solution.nthUglyNumber(10));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int nthUglyNumber(int n) {
        int []dp = new int[n+1];
        int p2 = 1;
        int p3 = 1;
        int p5 = 1;
        dp[1] = 1;
        for (int i=2;i<=n;i++){
            int num2 = dp[p2]*2;
            int num3 = dp[p3]*3;
            int num5 = dp[p5]*5;
            dp[i] = Math.min(Math.min(num2,num3),num5);
            if (num2==dp[i]){
                p2++;
            }
            if (num3==dp[i]){
                p3++;
            }
            if (num5==dp[i]){
                p5++;
            }
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



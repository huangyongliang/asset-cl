package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class ShuZhiDeZhengShuCiFangLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

        System.out.println(solution.myPow(2.00000,Integer.MAX_VALUE));
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double myPow(double x, int n) {

        return pow(x,n);
    }

    public double pow(double x, long n) {
        if (n==0){
            return 1;
        }
        if (n==1){
            return x;
        }

        if (n<0){
            return 1/pow(x,-n);
        }

        if (n%2==0){
            return pow(x*x,n/2);
        }else {
            return pow(x*x,n/2)*x;
        }
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}



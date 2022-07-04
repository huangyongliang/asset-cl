package com.hyl.leetcode.editor.cn;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class DaYinCong1daoZuiDaDeNweiShuLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.printNumbers(3)));
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] printNumbers(int n) {
        if (n<=0){
            return null;
        }
        if (n==1){
            return new int[]{1,2,3,4,5,6,7,8,9};
        }
        int[] pre = printNumbers(n-1);
        int min = 1;
        int max = 9;
        for (int i=0;i<n-1;i++){
            min = min * 10;
            max = max + 9 * min;
        }
        int count = max-min +1;
        int [] add = new int[count];
        int index = 0;
        for (int i = min ;i<=max ;i++){
            add[index++] = i;
        }

        int [] result = new int[pre.length+add.length];

        System.arraycopy(pre,0,result,0,pre.length);
        System.arraycopy(add,0,result,pre.length,add.length);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



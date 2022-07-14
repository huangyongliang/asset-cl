package com.hyl.leetcode.editor.cn;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class GouJianChengJiShuZuLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[] a = {1,2,3,4,5};
        int[] ints = solution.constructArr(a);
        System.out.println(Arrays.toString(ints));
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] constructArr(int[] a) {

        if (a.length<=1){
            return a;
        }

        int [] first = new int[a.length];
        first[0] = 1;
        for (int i = 1;i<first.length;i++){
            first[i] = first[i-1]*a[i-1];
        }

        int [] second = new int[a.length];
        second[a.length-1]=1;
        for (int i = a.length-2;i>=0;i--){
            second[i] = second[i+1]*a[i+1];
        }
        int[] result = new int[a.length];
        for (int i = 0 ;i < a.length;i++){
            result[i]= first[i]*second[i];
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



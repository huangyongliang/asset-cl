package com.hyl.leetcode.editor.cn;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ZuiXiaoDeKgeShuLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int [] res = new int[k];
        System.arraycopy(arr, 0,res,0,k);
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



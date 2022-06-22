package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class SqrtxTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int x = Integer.MAX_VALUE;
        int ret = solution.mySqrt(x);
        System.out.println(ret);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class YuanQuanZhongZuiHouShengXiaDeShuZiLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

        int i = solution.lastRemaining(10, 17);
        System.out.println(i);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lastRemaining(int n, int m) {
        int ans = 0;
        // 最后一轮剩下2个人，所以从2开始反推
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}



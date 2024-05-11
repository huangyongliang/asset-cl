package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class EditDistanceTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // 创建一个一维数组来存储最小操作数
        int[] dp = new int[n + 1];

        // 初始化第一行
        for (int j = 0; j <= n; j++) {
            dp[j] = j;
        }

        // 动态规划求解最小操作数
        for (int i = 1; i <= m; i++) {
            int pre = dp[0]; // 保存左上角的值
            dp[0] = i; // 更新第一列的值

            for (int j = 1; j <= n; j++) {
                int temp = dp[j]; // 保存当前位置的值

                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[j] = pre;
                } else {
                    dp[j] = Math.min(pre, Math.min(dp[j - 1], dp[j])) + 1;
                }

                pre = temp; // 更新左上角的值
            }
        }

        // 返回右下角的最小操作数
        return dp[n];
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}



package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class LongestValidParenthesesTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        String s = ")()((()))(";
        int result = solution.longestValidParentheses(s);
        System.out.println(result);
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestValidParentheses(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        int max = 0;
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



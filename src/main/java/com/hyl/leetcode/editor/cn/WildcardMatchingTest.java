package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class WildcardMatchingTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        String s = "aa";
        String p = "*a";
        System.out.println(solution.isMatch(s,p));
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isMatch(String s, String p) {

        int sLen = s.length();
        int pLen = p.length();
        boolean[][] dp = new boolean[sLen + 1][pLen + 1];
        dp[0][0] = true;
        for (int i = 1; i <= pLen; i++) {
            if (p.charAt(i - 1) == '*') {
                dp[0][i] = true;
            }else{
                break;
            }
        }

        for (int i = 1; i <= sLen; i++) {
            for (int j = 1; j <= pLen; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') && dp[i - 1][j - 1];
                }
            }
        }

        return dp[sLen][pLen];

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



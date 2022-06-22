package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class RegularExpressionMatchingTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        String s = "a";
        String p = "a.";
        System.out.println(solution.isMatch(s, p));


    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isMatch(String s, String p) {

        if (p.isEmpty()) {
            return s.isEmpty();
        }
        boolean firstMatch = (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class ImplementStrstrTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        String haystack = "haystack";
        String needle = "needle";
        int expected = -1;
        int actual = solution.strStr(haystack, needle);
        assert actual == expected;
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.length() == 0) {
                return 0;
            }
            if (haystack.length() < needle.length()) {
                return -1;
            }
            int i = 0;
            while (i + needle.length() <= haystack.length()) {
                if (haystack.startsWith(needle, i)) {
                    return i;
                }
                i++;
            }
            return -1;
        }

    }
    //leetcode submit region end(Prohibit modification and deletion)

}



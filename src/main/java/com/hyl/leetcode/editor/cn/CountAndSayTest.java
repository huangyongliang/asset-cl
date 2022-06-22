package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class CountAndSayTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int n = 4;
        String result = solution.countAndSay(n);
        System.out.println(result);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String countAndSay(int n) {

        if (n == 1) {
            return "1";
        }

        String s = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }
        sb.append(count).append(s.charAt(s.length() - 1));
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



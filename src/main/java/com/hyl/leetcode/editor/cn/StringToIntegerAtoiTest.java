package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class StringToIntegerAtoiTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        String s = "   -4234234234234234234";
        System.out.println(solution.myAtoi(s));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int myAtoi(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        int sign = 1;
        int i = 0;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        long res = 0;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            res = res * 10 + (s.charAt(i) - '0');
            if (sign == 1 && res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && res > Integer.MAX_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return ((int)res) * sign;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class JFETK5Test {

    @Test
    public  void test() {
        Solution solution = new Solution();

        String a = "11";
        String b = "10";
        String s = solution.addBinary(a, b);
        System.out.println(s);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int len = Math.max(lenA, lenB);
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int ai = i < lenA ? a.charAt(lenA - i - 1) - '0' : 0;
            int bi = i < lenB ? b.charAt(lenB - i - 1) - '0' : 0;
            int sum = ai + bi + carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



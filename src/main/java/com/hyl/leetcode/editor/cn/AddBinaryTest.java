package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class AddBinaryTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        String a = "11";
        String b = "1";
        String result = solution.addBinary(a, b);
        System.out.println(result);

    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



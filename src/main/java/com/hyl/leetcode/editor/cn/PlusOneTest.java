package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class PlusOneTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[] digits = {1, 2, 3};
        int[] result = solution.plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int[] result = new int[length];
        int carry = 1;
        for (int i = length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry == 1) {
            int[] newResult = new int[length + 1];
            newResult[0] = 1;
            for (int i = 0; i < length; i++) {
                newResult[i + 1] = result[i];
            }
            return newResult;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



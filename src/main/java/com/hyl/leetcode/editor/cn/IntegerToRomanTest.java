package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int num = 3;
        String result = solution.intToRoman(num);
        System.out.println(result);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String intToRoman(int num) {

        if (num < 1 || num > 3999) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(strs[i]);
            }
        }

        return sb.toString();


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



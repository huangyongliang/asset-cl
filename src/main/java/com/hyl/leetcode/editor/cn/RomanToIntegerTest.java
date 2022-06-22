package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("IV"));
        System.out.println(solution.romanToInt("IX"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));


    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int last = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int cur = getNum(s.charAt(i));
            if (cur < last) {
                sum -= cur;
            } else {
                sum += cur;
            }
            last = cur;
        }
        return sum;
    }

    private int getNum(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



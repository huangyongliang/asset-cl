package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class ValidNumberTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        // 去除首尾的空格
        s = s.trim();

        // 标记是否出现过数字、小数点和指数符号
        boolean hasDigit = false;
        boolean hasDot = false;
        boolean hasExp = false;

        // 标记指数符号后是否出现过数字
        boolean hasExpDigit = false;

        // 遍历字符串的每个字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                hasDigit = true;
                hasExpDigit = true;
            } else if (c == '+' || c == '-') {
                // 符号字符只能出现在开头或指数符号后面
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else if (c == '.') {
                // 小数点只能出现一次，并且不能在指数符号后面
                if (hasDot || hasExp) {
                    return false;
                }
                hasDot = true;
            } else if (c == 'e' || c == 'E') {
                // 指数符号只能出现一次，并且前面必须出现过数字
                if (hasExp || !hasDigit) {
                    return false;
                }
                hasExp = true;
                hasExpDigit = false;
            } else {
                // 出现非法字符
                return false;
            }
        }

        // 如果出现了指数符号，但指数后面没有数字，或者没有出现过数字，则不是有效数字
        if (hasExp && !hasExpDigit || !hasDigit) {
            return false;
        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class LengthOfLastWordTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("Hello World"));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (len > 0) {
                    return len;
                }
            } else {
                len++;
            }
        }
        return len;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



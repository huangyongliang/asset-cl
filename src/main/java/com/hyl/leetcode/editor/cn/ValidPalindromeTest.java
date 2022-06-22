package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

        String s = "race a car";
        System.out.println(solution.isPalindrome(s));


    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {

        if (s == null || s.length() == 0) {
            return true;
        }
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !isValid(s.charAt(left))) {
                left++;
            }
            while (left < right && !isValid(s.charAt(right))) {
                right--;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;


    }

    private boolean isValid(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



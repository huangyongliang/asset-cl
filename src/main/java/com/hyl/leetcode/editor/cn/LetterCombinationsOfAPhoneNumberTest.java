package com.hyl.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LetterCombinationsOfAPhoneNumberTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        String digits = "23";
        List<String> result = solution.letterCombinations(digits);
        System.out.println(result);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        String[] mapping = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder sb = new StringBuilder();
        helper(digits, 0, sb, result, mapping);
        return result;
    }


    private void helper(String digits, int index, StringBuilder sb, List<String> result, String[] mapping) {
        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            helper(digits, index + 1, sb, result, mapping);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}



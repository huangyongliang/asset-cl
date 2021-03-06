package com.hyl.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GenerateParenthesesTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        List<String> result = solution.generateParenthesis(4);
        System.out.println(result);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return Collections.singletonList("");
        }
        if (n == 1) {
            return Collections.singletonList("()");
        }
        if (n == 2) {
            return Arrays.asList("()()", "(())");
        }

        List<String> result = new ArrayList<>();

        for (int q = 0 ;q<n;q++){
            List<String> left = generateParenthesis(q);
            List<String> right = generateParenthesis(n-1-q);
            for(String l:left){
                for(String r:right){
                    result.add("("+l+")"+r);
                }
            }

        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



package com.hyl.leetcode.editor.cn;

import java.util.Stack;

import org.junit.jupiter.api.Test;

public class FanZhuanDanCiShunXuLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {

        if (s==null||s.length()==0){
            return "";
        }

        Stack<String> stack = new Stack<>();

        String[] s1 = s.split(" ");
        for (String sub:s1){
            sub = sub.trim();
            if (sub.length()!=0){
                stack.push(sub);
            }
        }
        if (stack.size()==0){
            return "";
        }
        if (stack.size()==1){
            return stack.pop();
        }
        StringBuilder sb = new StringBuilder();

        sb.append(stack.pop());
        while (!stack.empty()){
            sb.append(" ")
                .append(stack.pop());
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



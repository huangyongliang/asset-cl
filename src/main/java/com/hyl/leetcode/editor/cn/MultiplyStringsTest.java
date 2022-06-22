package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class MultiplyStringsTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        String num1 = "22";
        String num2 = "20";
        String result = solution.multiply(num1, num2);
        System.out.println(result);


    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String multiply(String num1, String num2) {

        if (num1 == null || num1.length() == 0 || num2 == null || num2.length() == 0) {
            return "";
        }

        int n1 = num1.length();
        int n2 = num2.length();
        int[] res = new int[n1 + n2];

        for (int i1 = n1-1; i1 >= 0; i1--) {
            for (int i2 = n2-1;i2 >= 0; i2--) {
                int  int1 = num1.charAt(i1) - 48;
                int  int2 = num2.charAt(i2) - 48;
                int index1= i1+i2;
                int index2 = i1+i2+1;
                int rest = int1 * int2 + res[index2];
                res[index1] += rest / 10;
                res[index2] = rest % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (int re : res) {
            if (first) {
                if (re == 0) {
                    continue;
                } else {
                    first = false;
                }
            }
            sb.append(re);
        }
        if (sb.length() == 0){
            return "0";
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



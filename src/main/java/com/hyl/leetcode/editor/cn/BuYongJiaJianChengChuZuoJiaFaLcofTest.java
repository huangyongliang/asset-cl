package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class BuYongJiaJianChengChuZuoJiaFaLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    /**
     考察位运算
     位运算有：1+0=1，1+1进位得0，0+0=0，0+1=1
     上面的形式不进位和异或运算相同，进位和与运算相同且左移一位
     a+b的和为进位和b+a（不进位和）当保存进位和的值b不为0时循环
     */
    public int add(int a, int b) {
        while(b != 0){
            int c = (a & b) << 1; //c进位
            a ^= b; // 不进位和
            b = c; // 进位
        }
        return a;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



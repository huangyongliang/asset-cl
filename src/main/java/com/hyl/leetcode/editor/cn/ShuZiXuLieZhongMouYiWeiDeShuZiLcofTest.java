package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class ShuZiXuLieZhongMouYiWeiDeShuZiLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

        System.out.println(solution.findNthDigit(1000000000));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findNthDigit(int n) {

        long m = n;

        long len = 1;
        long count = 9;
        long start = 1;
        while (m>len*count){
            m -= len*count;
            len++;
            count *= 10;
            start *= 10;
        }
        // n-1是因为n是从1开始的，而start是从0开始的,num实际的数字
        long num = start + (m-1)/len;
        String s = String.valueOf(num);
        // 转为字符串，然后取出第（n-1）%(len长度)个字符
        long index =(m-1)%len;
        return s.charAt((int)index)-'0';

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



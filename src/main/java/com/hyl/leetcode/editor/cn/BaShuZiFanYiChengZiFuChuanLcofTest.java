package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class BaShuZiFanYiChengZiFuChuanLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        System.out.println(solution.translateNum(26));
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int translateNum(int num) {

        if (num<10)
            return 1;

        String str = String.valueOf(num);
        int n = str.length();
        char[]chars = str.toCharArray();

        return find(chars,n);


    }

    public int find(char[]chars,int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }

        char pre = chars[n-2];
        char cur = chars[n-1];

        int count = Integer.parseInt(pre+String.valueOf(cur));


        if (n==2){
            if (count>25) return 1;
            if (count>=0) return 2;
            return 0;
        }

        if (count>25){
            return find(chars,n-1);
        }else if (10<=count){
            return find(chars,n-1)+find(chars,n-2);
        }else if (0<=count){
            return find(chars,n-1);
        }

        return 0;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}



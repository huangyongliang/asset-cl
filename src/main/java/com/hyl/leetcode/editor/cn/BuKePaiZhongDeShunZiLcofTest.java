package com.hyl.leetcode.editor.cn;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class BuKePaiZhongDeShunZiLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

        int [] arr = {0,6,1,2,5};
        boolean straight = solution.isStraight(arr);
        System.out.println(straight);
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isStraight(int[] nums) {
        int[] dic = new int[14];
        Arrays.fill(dic,0);
        for (int n : nums){
            // 排除对子
            if (dic[n]!=0 &&n!=0){
                return false;
            }
            dic[n]++;
        }
        int start=1;
        int end=13;
        for (int i = 1 ;i<14;i++){
            if (dic[i]!=0){
                start = i;
                break;
            }
        }
        for (int i=13;i>0;i--){
            if (dic[i]!=0){
                end = i;
                break;
            }
        }
        return end-start<=4;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}



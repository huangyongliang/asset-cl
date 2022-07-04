package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class KokoEatingBananasTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

        int []piles = new int[]{312884470};
        System.out.println(solution.minEatingSpeed(piles,312884469));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;
        for (int pile : piles){
            max = Math.max(max,pile);
        }

        int left = 1;
        int right = max;

        while (left<right){
            int mid = (left+right)/2;
            if (getTime(piles,mid)>h){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }


    public int getTime(int[] piles,int speed) {
        int time = 0;

        for (int pile :piles){
            time += (pile+speed-1)/speed;
        }
        return time;
    }



}
//leetcode submit region end(Prohibit modification and deletion)

}



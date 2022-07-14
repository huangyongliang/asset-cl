package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class ZaiPaiXuShuZuZhongChaZhaoShuZiLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int count = 0;

        for (int i=0;i<nums.length;i++){
            if (nums[i]==target){
                count++;
            }else if (nums[i]>target){
                break;
            }
        }
        return count;
    }



}
//leetcode submit region end(Prohibit modification and deletion)

}



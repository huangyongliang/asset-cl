package com.hyl.leetcode.editor.cn;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(solution.exchange(nums)) );

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] exchange(int[] nums) {
        if (nums==null||nums.length==0){
            return nums;
        }
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            while(left<right && nums[left]%2==1){
                left++;
            }
            while(left<right && nums[right]%2==0){
                right--;
            }
            if (left<right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] =temp;
            }

        }
        return nums;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}



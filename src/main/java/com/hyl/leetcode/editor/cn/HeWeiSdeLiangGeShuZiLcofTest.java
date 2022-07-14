package com.hyl.leetcode.editor.cn;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class HeWeiSdeLiangGeShuZiLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[] nums = {1,3,4,5,6,7,9};
        int target = 11;
        int[] ints = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(ints));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while (left<right){

            int sum = nums[left]+nums[right];
            if (sum==target){
                return new int[]{nums[left],nums[right]};
            }else if (sum>target){
                right--;
            }else {
                left++;
            }
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



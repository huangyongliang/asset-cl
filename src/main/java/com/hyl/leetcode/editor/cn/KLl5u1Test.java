package com.hyl.leetcode.editor.cn;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class KLl5u1Test {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int [] numbers = {1,2,4,6,10};
        int target = 8;
        System.out.println(Arrays.toString(numbers));
        System.out.println(target);
        int[] ints = solution.twoSum(numbers, target);
        System.out.println(Arrays.toString(ints));
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left=0;
        int right=numbers.length-1;
        while (left<right){

            int sum = numbers[left]+numbers[right];

            if (sum==target){
                result[0] = left;
                result[1] = right;
                return result;
            }else if (sum<target){
                left++;
            }else {
                right--;
            }

        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



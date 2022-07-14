package com.hyl.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class HeWeiSdeLianXuZhengShuXuLieLcofTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        int[][] continuousSequence = solution.findContinuousSequence(10);
        for (int[] ints : continuousSequence) {
            System.out.println(Arrays.toString(ints));
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] findContinuousSequence(int target) {

            if (target < 3) {
                return new int[][] {};
            }
            List<int[]> ret = new ArrayList<>();

            int left = 1;
            int right = 2;
            int sum = 3;
            int mid = target/2+1;
            while(left<right &&right<=mid){

                if (sum==target){
                    remark(ret,left,right);
                    right++;
                    sum+=right;
                }else if (sum>target){
                    sum-=left;
                    left++;
                }else{
                    right++;
                    sum+=right;
                }
            }
            int[][]result = new int[ret.size()][];
            for (int i=0;i<ret.size();i++){
                result[i] = ret.get(i);
            }
            return result;
        }

        public void remark(List<int[]> result,int left,int right){
            int[] nums = new int[right-left+1];
            for (int i = 0;i<nums.length;i++){
                nums[i] = i+left;
            }
            result.add(nums);
        }

    }
    //leetcode submit region end(Prohibit modification and deletion)

}



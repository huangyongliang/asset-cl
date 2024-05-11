package com.hyl.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class QTMn0oTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int [] numbers = {-1,-1,1};
        int k  = 0;
        int i = solution.subarraySum(numbers, k);
        System.out.println(i);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int i=0;i<nums.length;++i) {
            sum += nums[i];
            count += map.getOrDefault(sum-k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}



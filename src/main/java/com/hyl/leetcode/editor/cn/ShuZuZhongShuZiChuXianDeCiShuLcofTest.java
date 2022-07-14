package com.hyl.leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class ShuZuZhongShuZiChuXianDeCiShuLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[]nums = {1,2,10,4,1,4,3,3};
        int[]res = solution.singleNumbers(nums);
        System.out.println(Arrays.toString(res));
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] singleNumbers(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        int[]res = new int[2];
        int i = 0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if (entry.getValue()==1){
                res[i] = entry.getKey();
                i++;
            }
        }

        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



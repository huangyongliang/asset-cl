package com.hyl.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class ShuZuZhongShuZiChuXianDeCiShuIiLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> dic = new HashMap<>();

        for (int i = 0 ;i<nums.length;i++){
            if (dic.containsKey(nums[i])){
                int d = dic.get(nums[i]);
                dic.put(nums[i],++d);
            }else{
                dic.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : dic.entrySet()) {
            if (integerIntegerEntry.getValue()==1){
                return integerIntegerEntry.getKey();
            }
        }

        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



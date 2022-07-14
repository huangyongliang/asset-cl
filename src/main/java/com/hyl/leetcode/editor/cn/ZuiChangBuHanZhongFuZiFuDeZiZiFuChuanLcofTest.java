package com.hyl.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class ZuiChangBuHanZhongFuZiFuDeZiZiFuChuanLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> dic  = new HashMap<>();
        int start = -1;
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0;i<chars.length;i++){
            char c = chars[i];
            if (dic.containsKey(c)){
                start = Math.max(start,dic.get(c));
            }
            dic.put(c,i);
            result = Math.max(result,i-start);
        }
        return result;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}



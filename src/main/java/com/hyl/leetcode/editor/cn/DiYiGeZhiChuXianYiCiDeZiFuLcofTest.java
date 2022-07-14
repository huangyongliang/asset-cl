package com.hyl.leetcode.editor.cn;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.junit.jupiter.api.Test;

public class DiYiGeZhiChuXianYiCiDeZiFuLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar(""));
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char firstUniqChar(String s) {

        Map<Character,Integer> dic = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (char c:chars){
            if(dic.containsKey(c)){
                int count = dic.get(c);
                dic.put(c,++count);
            }else{
                dic.put(c,1);
                queue.add(c);
            }
        }
        while(!queue.isEmpty()){
            char c =queue.poll();
            if (dic.get(c)==1){
                return c;
            }
        }
        return ' ';
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



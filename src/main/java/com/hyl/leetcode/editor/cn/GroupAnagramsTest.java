package com.hyl.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class GroupAnagramsTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println(result);

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
            public List<List<String>> groupAnagrams(String[] strs) {
                Map<Double, List<String>> map = new HashMap<>();

                for (String s : strs) {
                    double d = encode(s);
                    List<String> list = map.computeIfAbsent(d, k -> new ArrayList<>());
                    list.add(s);
                }

                List<List<String>> res = new ArrayList<>();
                for (List<String> g : map.values()) {
                    res.add(g);
                }
                return res;
            }

            private int[] arr = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
            private double encode(String s) {
                double res = 1;
                for (char c : s.toCharArray()) {
                    res *= arr[c - 'a'];
                }
                return res;
            }

    }
    //leetcode submit region end(Prohibit modification and deletion)

}



package com.hyl.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class SubstringWithConcatenationOfAllWordsTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        System.out.println(solution.findSubstring(s, words));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for(String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int step = words[0].length();
        int n = s.length();
        int m = words.length;
        if(n < m * step) {
            return new ArrayList<>();
        }

        List<Integer> ans = new ArrayList<>();
        // 滑动窗口从0~step-1开始，每次移动step步
        for(int i = 0; i < step; ++i) {
            int left = i;
            int right = i;
            // 右边界超出字符串长度
            if(right + m * step > n) {
                break;
            }

            Map<String, Integer> window = new HashMap<>();
            int cnt = 0;

            // 滑动窗口
            while(right + step <= n) {
                // 移动右指针，形成初始窗口
                while (right - left < m * step) {
                    String str = s.substring(right, right + step);
                    right += step;
                    // 如果当前单词在字典中就计数
                    if(map.containsKey(str)) {
                        int num = window.getOrDefault(str, 0);
                        if(num + 1 == map.get(str)) {
                            cnt++;
                        } else if(num == map.get(str) && num + 1 > map.get(str)) {
                            cnt--;
                        }
                        window.put(str, num + 1);
                    }
                }

                if(cnt == map.size()) {
                    ans.add(left);
                }

                // 移动左指针
                String str = s.substring(left, left + step);
                left += step;
                // 如果当前单词在字典中就计数
                if(map.containsKey(str)) {
                    int num = window.getOrDefault(str, 0);
                    if(num - 1 == map.get(str)) {
                        cnt++;
                    } else if(num == map.get(str) && num - 1 < map.get(str)) {
                        cnt--;
                    }

                    if(num - 1 == 0) {
                        window.remove(str);
                    } else {
                        window.put(str, num - 1);
                    }
                }

            }
        }
        return ans;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}



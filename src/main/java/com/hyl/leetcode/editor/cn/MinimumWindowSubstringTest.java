package com.hyl.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class MinimumWindowSubstringTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        System.out.println(solution.minWindow("bbaa", "aba"));
    }
//leetcode submit region begin(Prohibit modification and deletion)

    public class Solution {
        public String minWindow(String s, String t) {
            // 初始化两个哈希表
            Map<Character, Integer> tCount = new HashMap<>();
            Map<Character, Integer> windowCount = new HashMap<>();
            for (char c : t.toCharArray()) {
                tCount.put(c, tCount.getOrDefault(c, 0) + 1);
            }

            // 初始化指针和计数器
            int left = 0, right = 0, count = t.length();
            int minStart = 0, minLen = Integer.MAX_VALUE;

            // 移动 right 指针
            while (right < s.length()) {
                char rightChar = s.charAt(right);
                // 如果当前字符在 t 中
                if (tCount.containsKey(rightChar)) {
                    windowCount.put(rightChar, windowCount.getOrDefault(rightChar, 0) + 1);
                    // 如果当前字符的个数不超过 t 中的个数,则计数器减一
                    if (windowCount.get(rightChar) <= tCount.get(rightChar)) {
                        count--;
                    }
                }

                // 如果窗口已经包含了 t 中所有字符
                while (count == 0) {
                    // 更新最小覆盖子串
                    int len = right - left + 1;
                    if (len < minLen) {
                        minLen = len;
                        minStart = left;
                    }

                    // 移动 left 指针
                    char leftChar = s.charAt(left);
                    if (tCount.containsKey(leftChar)) {
                        windowCount.put(leftChar, windowCount.get(leftChar) - 1);
                        if (windowCount.get(leftChar) < tCount.get(leftChar)) {
                            count++;
                        }
                    }
                    left++;
                }

                right++;
            }

            // 如果没有找到合适的子串,返回空字符串
            return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}



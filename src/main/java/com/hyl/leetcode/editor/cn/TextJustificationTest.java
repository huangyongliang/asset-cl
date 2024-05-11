package com.hyl.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TextJustificationTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int n = words.length;
        int currIndex = 0;

        while (currIndex < n) {
            int startIndex = currIndex;
            int currWidth = words[currIndex].length();
            currIndex++;

            // 将单词添加到当前行，直到超过最大宽度
            while (currIndex < n && currWidth + words[currIndex].length() + 1 <= maxWidth) {
                currWidth += words[currIndex].length() + 1;
                currIndex++;
            }

            int numWords = currIndex - startIndex;  // 当前行的单词数
            int numSpaces = maxWidth - currWidth;   // 剩余需要分配的空格数

            StringBuilder sb = new StringBuilder();
            sb.append(words[startIndex]);

            // 如果只有一个单词或者是最后一行，则左对齐单词
            if (numWords == 1 || currIndex == n) {
                for (int i = startIndex + 1; i < currIndex; i++) {
                    sb.append(" ").append(words[i]);
                }
                for (int i = 0; i < numSpaces; i++) {
                    sb.append(" ");
                }
            } else {
                int avgSpaces = numSpaces / (numWords - 1);  // 单词之间的平均空格数
                int extraSpaces = numSpaces % (numWords - 1); // 需要分配的额外空格数

                for (int i = startIndex + 1; i < currIndex; i++) {
                    sb.append(" ");
                    for (int j = 0; j < avgSpaces; j++) {
                        sb.append(" ");
                    }
                    if (extraSpaces > 0) {
                        sb.append(" ");
                        extraSpaces--;
                    }
                    sb.append(words[i]);
                }
            }

            result.add(sb.toString());
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



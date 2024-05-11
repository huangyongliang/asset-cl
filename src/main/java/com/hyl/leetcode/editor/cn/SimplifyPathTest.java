package com.hyl.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.jupiter.api.Test;

public class SimplifyPathTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String simplifyPath(String path) {
        // 拆分路径
        String[] parts = path.split("/");
        Deque<String> stack = new ArrayDeque<>();

        // 遍历路径的各个部分
        for (String part : parts) {
            if (part.equals(".") || part.isEmpty()) {
                // 当前目录或空字符串，无需操作
                continue;
            } else if (part.equals("..")) {
                // 上一级目录，出栈
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // 有效目录名，入栈
                stack.push(part);
            }
        }

        // 构建简化的规范路径
        StringBuilder simplifiedPath = new StringBuilder();
        while (!stack.isEmpty()) {
            simplifiedPath.append("/").append(stack.pollLast());
        }

        return simplifiedPath.length() > 0 ? simplifiedPath.toString() : "/";
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}



package com.hyl.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PermutationSequenceTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        int[] factorial = new int[n + 1];
        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        StringBuilder result = new StringBuilder();

        while (n > 0) {
            int total = factorial[n - 1];
            int index = (k - 1) / total;
            result.append(nums.get(index));
            nums.remove(index);
            k = (k - 1) % total + 1;
            n--;
        }

        return result.toString();
    }
}


//leetcode submit region end(Prohibit modification and deletion)

}



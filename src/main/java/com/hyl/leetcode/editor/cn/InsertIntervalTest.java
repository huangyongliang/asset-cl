package com.hyl.leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class InsertIntervalTest {

    @Test
    public  void test() {
        Set<Integer> set = new HashSet<Integer>();

        Solution solution = new Solution();
        int[][] intervals = {{1,2}, {6, 9}};
        int[][] result = solution.insert(intervals, new int[]{2, 5});
        System.out.println(Arrays.deepToString(result));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] result = new int[intervals.length + 1][2];
        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result[i] = intervals[i];
            i++;
        }
        int j = i;
        while (j < intervals.length && intervals[j][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[j][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[j][1]);
            j++;
        }
        result[i] = newInterval;
        while (j < intervals.length) {
            result[i + 1] = intervals[j];
            i++;
            j++;
        }
        return Arrays.copyOf(result, i + 1);




    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



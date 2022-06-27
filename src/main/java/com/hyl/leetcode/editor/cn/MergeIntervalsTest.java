package com.hyl.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MergeIntervalsTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[][] intervals = new int[][]{{2,3},{4,5},{6,7},{8,9},{1,10}};
        for (int[] out :intervals){
            System.out.println(Arrays.toString(out));
        }
        int[][] merge = solution.merge(intervals);
        for (int[] out :merge){
            System.out.println(Arrays.toString(out));
        }

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        int index = 0;
        int [] cp = intervals[index];
        List<int[]> result = new ArrayList<>();
        while (index < intervals.length){
            if (index==intervals.length-1){
                result.add(cp);
                break;
            }
            if (cp[1]>=intervals[index+1][0]){
                cp[1] = Math.max(cp[1],intervals[index+1][1]);
            }else{
                result.add(cp);
                cp = intervals[index+1];
            }
            index++;
        }

        int[][] count = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            count[i] = result.get(i);
        }

        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



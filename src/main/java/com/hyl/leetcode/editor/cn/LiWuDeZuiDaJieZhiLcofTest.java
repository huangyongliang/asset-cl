package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class LiWuDeZuiDaJieZhiLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[][] grid = new int[][]{{1,2,5},
                                    {3,2,1}};

        System.out.println(solution.maxValue(grid));
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxValue(int[][] grid) {
        //边界初始化
        for (int i=grid.length-2;i>=0;i--) grid[i][grid[0].length-1] +=grid[i+1][grid[0].length-1];

        for (int i=grid[0].length-2;i>=0;i--) grid[grid.length-1][i] +=grid[grid.length-1][i+1];

        // 循环填表
        for(int i = grid.length-2;i>=0;i--){
            for (int j=grid[0].length-2;j>=0;j--){
                grid[i][j] += Math.max(grid[i+1][j],grid[i][j+1]);
            }
        }
        return grid[0][0];
    }



}
//leetcode submit region end(Prohibit modification and deletion)

}



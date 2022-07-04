package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class UniquePathsTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int uniquePaths(int m, int n) {

        int[][]result =  new int[m+1][n+1];
        for (int i = 0 ;i<=m;i++) result[i][1]=1;
        for (int i = 0 ;i<=n;i++) result[1][i]=1;
        for (int i=2;i<=m;i++){
            for (int j=2;j<=n;j++){
                result[i][j]= result[i][j-1]+result[i-1][j];
            }
        }
        return result[m][n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



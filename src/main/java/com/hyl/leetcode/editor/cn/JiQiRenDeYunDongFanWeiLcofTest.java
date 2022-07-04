package com.hyl.leetcode.editor.cn;

import java.util.Deque;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

public class JiQiRenDeYunDongFanWeiLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        System.out.println(solution.movingCount(2, 3, 1));

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int movingCount(int m, int n, int k) {
        if (k==0){
            return 1;
        }
        Deque<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        int[] dx ={0,1};
        int[] dy ={1,0};
        int count = 1;
        queue.offer(new int[]{0,0});
        visited[0][0] = true;
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    int x = cur[0]+dx[i];
                    int y = cur[1]+dy[j];
                    if(x>=0&&x<m&&y>=0&&y<n&&!visited[x][y]&&getDigitSum(x)+getDigitSum(y)<=k){
                        queue.offer(new int[]{x,y});
                        visited[x][y] = true;
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private int getDigitSum(int num){
        int sum = 0;
        while(num>0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



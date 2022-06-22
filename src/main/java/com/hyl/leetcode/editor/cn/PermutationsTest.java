package com.hyl.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PermutationsTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[] nums = {1,1,2};
        List<List<Integer>> lists = solution.permute(nums);
        System.out.println(lists);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        boolean [] visited = new boolean[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(!visited[i]) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                visited[i] = true;
                dfs(nums, visited, list, res);
                visited[i] = false;
            }
        }


        return res;
    }

    private void dfs(int[] nums,boolean[]visited,List<Integer>list,List<List<Integer>> res){

        if (list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]){
                visited[i]= true;
                list.add(nums[i]);
                dfs(nums,visited,list,res);
                visited[i] = false;
                list.remove(list.size()-1);
            }
        }

    }





}
//leetcode submit region end(Prohibit modification and deletion)

}



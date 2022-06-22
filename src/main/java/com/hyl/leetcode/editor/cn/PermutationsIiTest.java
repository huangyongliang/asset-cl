package com.hyl.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PermutationsIiTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[] nums = {1,3,2,1,2,3};
        List<List<Integer>> lists = solution.permuteUnique(nums);
        System.out.println(lists);
        System.out.println(lists.size());
        lists.forEach(System.out::println);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean [] visited = new boolean[nums.length];

        Arrays.sort(nums);
        dfs(nums, visited, list, res);
        return res;
    }

    private void dfs(int[] nums,boolean[]visited,List<Integer>list,List<List<Integer>> res){

        if (list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (!visited[i]){
                if (i>0 && nums[i]==nums[i-1] && !visited[i-1]){
                    continue;
                }
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



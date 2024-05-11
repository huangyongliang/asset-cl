package com.hyl.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SubsetsTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[] nums = {1,2,3};
        List<List<Integer>> res = solution.subsets(nums);
        for (List<Integer> re : res) {
            for (Integer integer : re) {
                System.out.print(integer);
            }
            System.out.println();
        }
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(nums, 0, path, res);
        return res;

    }

    private void dfs(int[] nums, int start, List<Integer> path, List<List<Integer>> res) {
        res.add(new ArrayList<>(path));

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums, i + 1, path, res);
            path.remove(path.size() - 1);
        }
    }



}
//leetcode submit region end(Prohibit modification and deletion)

}



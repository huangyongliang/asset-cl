package com.hyl.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CombinationSumTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int []nums = new int[]{2,2,3,6,7};
        int target = 8;
        List<List<Integer>> result = solution.combinationSum(nums,target);
        System.out.println(result);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        if (candidates == null || candidates.length == 0) {
            return null;
        }
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        dfs(candidates, target, 0, new ArrayList<>(), result);
        return result;

    }

    private void dfs(int[] candidates, int target, int start, List<Integer> list, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }
            list.add(candidates[i]);
            dfs(candidates, target - candidates[i], i, list, result);
            list.remove(list.size() - 1);
        }
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}



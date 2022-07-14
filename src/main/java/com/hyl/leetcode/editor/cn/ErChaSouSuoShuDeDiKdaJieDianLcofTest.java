package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class ErChaSouSuoShuDeDiKdaJieDianLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int count;
    private int target;

    private int result;

    public int kthLargest(TreeNode root, int k) {
        count =0;
        target = k;
        read(root);
        return result;
    }

    public void read(TreeNode node){

        if(node==null)
            return;

        read(node.right);
        count++;
        if (count==target){
            result = node.val;
            return;
        }
        read(node.left);
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}

    }
}



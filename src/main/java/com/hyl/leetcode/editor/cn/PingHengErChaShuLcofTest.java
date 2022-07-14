package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class PingHengErChaShuLcofTest {

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
    public boolean isBalanced(TreeNode root) {

        if (root==null)
            return true;

        int leftDepth = depth(root.left,0);
        int rightDepth = depth(root.right,0);

        if (Math.abs(leftDepth-rightDepth)>1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }

    public int depth(TreeNode node,int de){
        if (node==null)
            return de;
        de++;
        return Math.max(depth(node.left,de),depth(node.right,de));
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



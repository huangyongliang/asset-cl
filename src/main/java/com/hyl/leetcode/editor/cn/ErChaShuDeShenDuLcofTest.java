package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class ErChaShuDeShenDuLcofTest {

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

    private int max;
    public int maxDepth(TreeNode root) {
        max = 0;

        read(root,0);

        return max;
    }

    public void read (TreeNode node,int depth){
        if (node==null){
            return;
        }

        depth++;

        if (node.left==null&&node.right==null){
            max = Math.max(max,depth);
        }
        read(node.left,depth);
        read(node.right,depth);


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



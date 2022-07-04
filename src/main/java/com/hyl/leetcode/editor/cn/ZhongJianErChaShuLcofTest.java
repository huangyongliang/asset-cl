package com.hyl.leetcode.editor.cn;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ZhongJianErChaShuLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[] preorder ={3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode root = solution.buildTree(preorder, inorder);
        System.out.println(root.val);

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int i = 0;
        while (i < inorder.length && inorder[i] != preorder[0]) {
            i++;
        }
        int[] leftPreorder = Arrays.copyOfRange(preorder, 1, i + 1);
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, i);
        int[] rightPreorder = Arrays.copyOfRange(preorder, i + 1, preorder.length);
        int[] rightInorder = Arrays.copyOfRange(inorder, i + 1, inorder.length);
        root.left = buildTree(leftPreorder, leftInorder);
        root.right = buildTree(rightPreorder, rightInorder);
        return root;



    }
}
//leetcode submit region end(Prohibit modification and deletion)

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}



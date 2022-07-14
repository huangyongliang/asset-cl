package com.hyl.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ErChaSouSuoShuDeZuiJinGongGongZuXianLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        TreeNode treeNode = solution.lowestCommonAncestor(root,
            new TreeNode(7), new TreeNode(8));
        System.out.println(treeNode);
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode>pList = new ArrayList<>();
        List<TreeNode>qList = new ArrayList<>();

        read(root,p,pList);
        read(root,q,qList);

        TreeNode result = null;

        for (int i=0;i< qList.size()&&i< pList.size();i++){
            TreeNode qNode = qList.get(i);
            TreeNode pNode = pList.get(i);
            if (qNode.val==pNode.val){
                result = qNode;
            }else {
                break;
            }
        }

        return result;
    }


    public void read(TreeNode root,TreeNode node, List<TreeNode> list){
        if (root==null)
            return;
        if (root.val== node.val){
            list.add(root);
            return;
        }
        if (root.val> node.val){
            list.add(root);
            read(root.left,node,list);
        }
        if (root.val< node.val){
            list.add(root);
            read(root.right,node,list);
        }
    }


}
//leetcode submit region end(Prohibit modification and deletion)

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}

        @Override
        public String toString() {
            return ""+val;
        }
    }
}



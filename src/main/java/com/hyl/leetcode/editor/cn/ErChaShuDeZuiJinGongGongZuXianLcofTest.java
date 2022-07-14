package com.hyl.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ErChaShuDeZuiJinGongGongZuXianLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        List<TreeNode> list = new ArrayList<>();
        List<TreeNode> result = new ArrayList<>();
        solution.read(root,new TreeNode(4),list,result);
        System.out.println(result);

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
         List<TreeNode> pList = new ArrayList<>();
         List<TreeNode> qList = new ArrayList<>();

         List<TreeNode> temp = new ArrayList<>();

         read(root,q,temp,qList);
         temp.clear();
         read(root,p,temp,pList);

         TreeNode result = null;
         for (int i = 0 ;i < qList.size()&&i< pList.size();i++){
             TreeNode qNode = qList.get(i);
             TreeNode pNode = pList.get(i);
             if (qNode.val == pNode.val){
                 result = qNode;
             }else {
                 break;
             }
         }


        return result;
    }


    public void read(TreeNode root, TreeNode node, List<TreeNode> list,List<TreeNode> result){
        if (root==null)
            return;
        if (root.val== node.val){
            list.add(root);
            result.addAll(list);
            return;
        }
    
        list.add(root);
        read(root.left,node,list,result);
        read(root.right,node,list,result);
        list.remove(root);

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



package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class XuLieHuaErChaShuLcofTest {

    @Test
    public  void test() {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        
        Codec solution = new Codec();

        String serialize = solution.serialize(root);

        TreeNode deserialize = solution.deserialize(serialize);

        System.out.println(serialize);

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
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root==null)
            return "";

        String left = "";
        if (root.left!=null){
            left = "["+serialize(root.left)+"]";
        }
        String right = "";
        if (root.right!=null){
            right = "{"+serialize(root.right)+"}";
        }
        return "("+root.val+")"+left+right;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {


        if (data==null||data.length()==0){
            return null;
        }

        if (data.charAt(0)!='(')
            return null;

        int index = 0;
        for (int i=1;i<data.length();i++){
            if (data.charAt(i)==')'){
                index = i;
                break;
            }
        }

        int val = Integer.parseInt(data.substring(1,index));
        TreeNode node = new TreeNode(val);

        String sun = data.substring(index+1);

        if (sun.length()==0){
            return node;
        }

        if (sun.charAt(0)=='{'){
            node.right = deserialize(sun.substring(1,sun.length()-1));
            return node;
        }
        if (sun.charAt(0)=='['){

            int count =0;
            int end = 0;
            for (int i =0 ;i<sun.length();i++){
                if (sun.charAt(i)=='['){
                    count++;
                    continue;
                }
                if (sun.charAt(i)==']'){
                    count--;
                    if (count==0){
                        end = i;
                        break;
                    }
                }
            }
            node.left = deserialize(sun.substring(1,end));
            if (end !=sun.length()-1 ){
                node.right = deserialize(sun.substring(end+2,sun.length()-1));
            }
            return node;
        }

        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
//leetcode submit region end(Prohibit modification and deletion)


    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }
}



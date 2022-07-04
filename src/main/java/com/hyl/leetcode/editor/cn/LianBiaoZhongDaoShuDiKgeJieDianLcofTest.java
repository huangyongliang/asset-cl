package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class LianBiaoZhongDaoShuDiKgeJieDianLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {

       int count =1;
       ListNode node = head;
       while(node.next!=null){
           count++;
           node = node.next;
       }

       node = head;

       for (int i = 0 ;i<count-k;i++){
           node = node.next;
       }
        return node;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }



}



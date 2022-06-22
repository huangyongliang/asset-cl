package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class SwapNodesInPairsTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode listNode = solution.swapPairs(head);
        System.out.println(listNode.val);
        while (listNode.next!=null){
            listNode = listNode.next;
            System.out.println(listNode.val);
        }

    }
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode next = head.next;
        while (next != null) {
            cur.next = next.next;
            next.next = cur;
            pre.next = next;
            pre = cur;
            cur = cur.next;
            if (cur != null) {
                next = cur.next;
            } else {
                next = null;
            }
        }
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) { this.val =val;}
        ListNode(int val, ListNode next) { this.val = val;this.next = next;}

    }

}



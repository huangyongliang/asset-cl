package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));

        solution.removeNthFromEnd(head, 3);

        System.out.println(head.val);
        while (head.next!=null){
            head = head.next;
            System.out.println(head.val);
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
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



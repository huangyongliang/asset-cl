package com.hyl.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.jupiter.api.Test;

public class ReverseNodesInKGroupTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);


        ListNode listNode = solution.reverseKGroup(head, 4);
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        ListNode next = head.next;
        Deque<ListNode> stack = new ArrayDeque<>(k);
        while (next != null) {
            for (int i = 0; i < k; i++) {
                if (cur == null) {
                    return dummy.next;
                }
                stack.push(cur);
                cur = cur.next;
            }

            while (!stack.isEmpty()) {
                pre.next = stack.pop();
                pre = pre.next;
            }
            pre.next = cur;
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



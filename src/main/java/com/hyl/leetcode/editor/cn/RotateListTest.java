package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;


public class RotateListTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        // 计算链表长度
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            length++;
        }

        // 取模得到实际需要移动的步数
        k = k % length;

        if (k == 0) {
            return head;
        }

        // 创建新的指针指向原链表头节点
        ListNode newHead = head;

        // 找到原链表的最后一个节点，并将其与头节点相连形成循环链表
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;

        // 根据步数计算新链表的尾节点位置
        int newTailIndex = length - k - 1;

        // 找到新链表的尾节点，并将其下一个节点作为新的链表头节点，断开循环链表
        ListNode newTail = head;
        for (int i = 0; i < newTailIndex; i++) {
            newTail = newTail.next;
        }
        newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}



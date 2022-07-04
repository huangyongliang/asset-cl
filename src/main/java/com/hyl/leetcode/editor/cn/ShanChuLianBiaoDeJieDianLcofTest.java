package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class ShanChuLianBiaoDeJieDianLcofTest {

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
    public ListNode deleteNode(ListNode head, int val) {

        if (head.val==val){
            return head.next;
        }

        ListNode pre = head;
        while (pre.next!=null){
            if (pre.next.val==val){
                pre.next = pre.next.next;
                return head;
            }
            pre = pre.next;
        }


        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}



package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class FanZhuanLianBiaoLcofTest {

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
    public ListNode reverseList(ListNode head) {

        ListNode node = head;
        ListNode pre=null;
        ListNode cur=null;
        while (node!=null){
            cur = new ListNode(node.val);
            cur.next = pre;
            node = node.next;
            pre = cur;
        }
        return cur;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}



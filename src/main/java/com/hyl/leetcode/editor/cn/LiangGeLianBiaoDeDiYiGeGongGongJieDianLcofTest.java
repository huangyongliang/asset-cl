package com.hyl.leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class LiangGeLianBiaoDeDiYiGeGongGongJieDianLcofTest {

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
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> setA = new HashSet<>();
        ListNode index;
        index = headA;
        while (index!=null){
            setA.add(index);
            index = index.next;
        }

        index = headB;
        while(index!=null){
            if (setA.contains(index)){
                return index;
            }
            index = index.next;
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}



package com.hyl.leetcode.editor.cn;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.jupiter.api.Test;

public class YongLiangGeZhanShiXianDuiLieLcofTest {

    @Test
    public  void test() {
        CQueue cQueue = new CQueue();

        cQueue.appendTail(1);

        cQueue.appendTail(3);
        cQueue.deleteHead();
        cQueue.appendTail(4);

    }
//leetcode submit region begin(Prohibit modification and deletion)
class CQueue {

    Deque<Integer> inStack ;
    Deque<Integer> outStack;

    public CQueue() {
        inStack =new ArrayDeque<>();
        outStack = new ArrayDeque<>();
    }
    
    public void appendTail(int value) {
        inStack.push(value);
    }
    
    public int deleteHead() {
        if (inStack.isEmpty()&&outStack.isEmpty()) {
            return -1;
        }
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
//leetcode submit region end(Prohibit modification and deletion)

}



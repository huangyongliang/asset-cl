package com.hyl.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ShuJuLiuZhongDeZhongWeiShuLcofTest {

    @Test
    public  void test() {
        MedianFinder solution = new MedianFinder();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class MedianFinder {


        private List<Integer> list ;


    /** initialize your data structure here. */
    public MedianFinder() {
        list = new ArrayList<>();
    }
    
    public void addNum(int num) {
        list.add(num);
    }
    
    public double findMedian() {
        if (list.size()==0){
            return 0;
        }

        list.sort(Integer::compare);
        if (list.size()%2==0){
            int index = list.size()/2;
            return ((double)list.get(index)+(double)list.get(index-1))/2;
        }else {
            int index = list.size()/2;
            return list.get(index);
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
//leetcode submit region end(Prohibit modification and deletion)

}



package com.hyl.leetcode.editor.cn;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

         if (m == 0) {
             System.arraycopy(nums2, 0, nums1, 0, n);
         }
         if (n == 0) {
             return;
         }

         int[] temp = new int[m + n];
         int i = 0;
         int j = 0;
         int k = 0;
         while (i < m && j < n) {
             if (nums1[i] < nums2[j]) {
                 temp[k++] = nums1[i++];
             }
             else {
                 temp[k++] = nums2[j++];
             }
         }
         while (i < m) {
             temp[k++] = nums1[i++];
         }
         while (j < n) {
             temp[k++] = nums2[j++];
         }
         System.arraycopy(temp, 0, nums1, 0, m + n);



    }
}
//leetcode submit region end(Prohibit modification and deletion)

}



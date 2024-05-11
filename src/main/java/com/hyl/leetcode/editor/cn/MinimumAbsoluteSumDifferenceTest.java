package com.hyl.leetcode.editor.cn;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class MinimumAbsoluteSumDifferenceTest {

    @Test
    public  void test() {
        Solution solution = new Solution();

    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int mod = (int) 1e9 + 7;
        int n = nums1.length;

        // 计算初始的绝对差值和
        int[] diffArray = new int[n];
        long diffSum = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            diffArray[i] = diff;
            diffSum = (diffSum + diff) % mod;
        }

        if (diffSum == 0) {
            return 0;
        }

        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(nums1);

        for (int i = 0; i < n; i++) {
            int target = nums2[i];
            int diff = diffArray[i];
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums1[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            int newDiff = Math.abs(nums1[left] - target);
            minDiff = Math.min(minDiff, diff - (diff - newDiff));

            if (minDiff == 0) {
                return 0;
            }
        }

        return (int) ((diffSum - minDiff + mod) % mod);
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}



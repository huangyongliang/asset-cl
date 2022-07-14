package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class BaShuZuPaiChengZuiXiaoDeShuLcofTest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        int [] nums = new int[]{3,30,34,5,9};
        System.out.println(solution.minNumber(nums));
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i =0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }

        quickSort(str, 0, str.length-1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }

        return sb.toString();
    }

    public void quickSort(String[] str,int left,int right){
        if (left >= right) {
            return;
        }

        String pivot = str[right];
        int mid = left-1;
        for (int i = left;i<right;i++){
            if((str[i]+pivot).compareTo(pivot+str[i])<0){
                mid++;
                String temp = str[mid];
                str[mid] = str[i];
                str[i] = temp;
            }
        }
        String temp = str[mid+1];
        str[mid+1] = str[right];
        str[right] = temp;

        quickSort(str,left,mid);
        quickSort(str,mid+2,right);

    }


}
//leetcode submit region end(Prohibit modification and deletion)

}



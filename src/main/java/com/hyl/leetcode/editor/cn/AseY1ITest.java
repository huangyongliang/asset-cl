package com.hyl.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

public class AseY1ITest {

    @Test
    public  void test() {
        Solution solution = new Solution();
        String [] words = {"abcw","baz","foo","bar","fxyz","abcdef"};
        int i = solution.maxProduct(words);
        System.out.println(i);
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProduct(String[] words) {

        int result = 0;
        int []wordBit = new int[words.length];

        for (int i = 0 ;i < words.length ;i++)  {
            String word = words[i];
            int bit = 0;
            for (int j = 0; j < word.length(); j++){
                bit |= 1 << (word.charAt(j)-'a');
            }
            wordBit[i]= bit;
        }


        for ( int i = 0 ;i<wordBit.length;i++){
            for (int j = i+1;j<wordBit.length;j++){
                if ((wordBit[i]&wordBit[j])==0){
                    result = Math.max(result,words[i].length()*words[j].length());
                }
            }
        }

        return result;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}



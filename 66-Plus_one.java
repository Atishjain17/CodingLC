class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length-1;
        for (;len>=0;len--){
            if(digits[len]<9){
                digits[len]++;
                return digits;
            }
            digits[len] = 0;
        }
        
        int [] ans = new int[digits.length+1];
        ans[0]=1;
        return ans;
    }
}

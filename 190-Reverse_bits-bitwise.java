public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for(int i=0;i<31;i++){
            ans = (ans | (n & 1));
            ans <<=1;
            n >>>=1; // for unsigned bit
        }
        ans = ans | (n & 1);
        return ans;
    }
}
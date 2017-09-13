class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        return !(n&(n-1));   //since only 1 bit is 1 //n&(n-1) removes last set bit    
    }
}
class Solution {
    public boolean isPowerOfFour(int num) {
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
        //0x55555555 is to get rid of those power of 2 but not power of 4 // 0x5 == 0101 ...55=0101 0101
        //so that the single 1 bit always appears at the odd position
    }
}
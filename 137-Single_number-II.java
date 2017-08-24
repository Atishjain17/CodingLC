/* All 3 times, one 1 time; first time put in one, second time put in two, third time remove from both */
class Solution {
    public int singleNumber(int[] nums) {
    int ones = 0, twos = 0;
    for(int i = 0; i < nums.length; i++){
        ones = (ones ^ nums[i]) & ~twos;
        twos = (twos ^ nums[i]) & ~ones;
    }
    return ones;
}
}
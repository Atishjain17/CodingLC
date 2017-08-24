class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        int i=0;
        for (;i<nums.length;i++){
            ans = ans ^ nums[i] ^ i;
        }
        return ans ^ i;
    }
}
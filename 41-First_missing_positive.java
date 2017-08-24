/* Find first missing positive ,O(n) time constant, space}*/
public class Solution {
    public int firstMissingPositive(int[] nums) {
    int n = nums.length;
    int j;
    for (int i=0;i<n;i++){
        while (nums[i]>0 && nums[i] <=n && nums[i] != nums[nums[i]-1]) {
            j = nums[i]-1;
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
        }
    }
        
    for (int i = 0; i < n; i++)
        if (nums[i] != i + 1)
            return i + 1;
    return n + 1;
    }
    
}
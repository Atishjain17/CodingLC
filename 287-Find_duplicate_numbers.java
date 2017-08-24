/*
Find duplicate numbers:
Constraints:
You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.
*/
class Solution {
    public int findDuplicate(int[] nums) {
        if (nums.length > 1){
            int slow = nums[0];
            int fast = nums[nums[0]];
            while(slow!=fast){
                slow = nums[slow];
                fast = nums[nums[fast]];
            }
            fast = 0;
            while(slow!=fast){
                fast=nums[fast];
                slow=nums[slow];
            }
            return slow;
        }
        return -1;
    }
}
/*Move zeros to end*/
class Solution {
    public void moveZeroes(int[] nums) {
     int move=0;
        for (int i=0; i<nums.length;i++){
            if (nums[i] == 0)
                move++;
            else
                nums[i-move] = nums[i];
        }
        for (int i=nums.length-move; i<nums.length;i++)
            nums[i]=0;
        
    }
}
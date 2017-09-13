//sort 0's then 1's then 2's
class Solution {
    public void sortColors(int[] nums) {
        int twos = nums.length-1;
        int zeros = 0;
        for(int i=0;i<=twos;){ // not i++ because if 2 is swapped with 2 we dont want to move i forward 
            if (nums[i]==2) {
                int temp = nums[i];
                nums[i] = nums[twos];
                nums[twos] = temp;
                twos--;
            }
            else if (nums[i]==0) {
                int temp = nums[i];
                nums[i] = nums[zeros];
                nums[zeros] = temp;
                zeros++;
                i++;
            }
            else i++;
        }
    }
}
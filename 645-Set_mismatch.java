/*
Contains no from 1 to n but, 1 double and 1 missing
*/
class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] ans= new int[2];
        for (int i : nums){
            if (nums[Math.abs(i)-1] >=0)
                nums[Math.abs(i)-1] *= -1;
            else ans[0]=Math.abs(i);
        }
        for (int i=0;i<nums.length;i++){
            if (nums[i]>0){
                ans[1]=i+1;
                break;}
        }
    return ans;
        
    }
}
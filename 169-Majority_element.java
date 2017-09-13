class Solution {
    public int majorityElement(int[] nums) {
        //Assuming an element is more than n/2
        //nlogn soln --> arrays.sort -- return nums[n/2]
        int major=nums[0], count = 1;
        for(int i=1; i<nums.length;i++){
            if(count==0){
                count++;
                major=nums[i];
            }else if(major==nums[i]){
                count++;
            }else count--;
            
        }
        return major;
    }
}
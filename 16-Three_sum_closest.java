class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans= Integer.MAX_VALUE;
        int min1= ans;
        for (int i=0;i<nums.length-2;i++){
            if (i==0 || nums[i]!=nums[i-1]){
            int lo=i+1,hi=nums.length-1;
            while(lo<hi){
                int sum1 = nums[lo]+nums[hi]+nums[i];
                int sum = Math.abs(target-sum1);
                if (sum<min1){
                    min1=sum;
                    ans=sum1;
                }
                if (target>sum1) lo++;
                else if (target < sum1) hi--;
                else
                    break;
            }
        }
    }
        return ans;
    }
}
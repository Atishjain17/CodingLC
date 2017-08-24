public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new LinkedList<>();
        for (int i=0;i<nums.length-2;i++){
            if (i==0 || nums[i]!=nums[i-1]){ //dont forget this condition
            int lo=i+1,hi=nums.length-1,target=0-nums[i];
            while(lo<hi){
                int sum = nums[lo]+nums[hi];
                if(sum==target){
                    answer.add(Arrays.asList(nums[lo],nums[hi],nums[i]));
                    while(lo<hi && nums[lo]==nums[lo+1]) lo++;
                    while(lo<hi && nums[hi]==nums[hi-1]) hi--;
                    lo++;
                    hi--;
                    
                }
                else if (sum<target) lo++;
                else hi--;
            }
        }
        }
    return answer;
    }
}
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hash = new HashMap <Integer,Integer> ();
        int [] result = new int [2];
        for(int i = 0; i< nums.length; i++)
        {
            if (hash.containsKey(target-nums[i])){
                result[1] = i;
                result[0] = hash.get(target-nums[i]);
            }
                
            else
                hash.put(nums[i],i);
        }
        return result;
    }
}

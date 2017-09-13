//Element appears more than n/3 times
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<Integer> ();
        if (nums.length==0){
            return result;
        }
        if (nums.length<3){
            result.add(nums[0]);
            if (nums.length==2 && nums[0]!=nums[1])
                result.add(nums[1]);
            return result;
        }
        int major1=nums[0], major2=nums[1], count1 = 0, count2=0;
        for(int i=0; i<nums.length;i++){
            if(major1==nums[i]){
                count1++;
            }else if(major2==nums[i]){
                count2++;
            }else if(count1==0){
                count1++;
                major1=nums[i];
            }else if(count2==0){
                count2++;
                major2=nums[i];
            }else{
                count1--;
                count2--;
            }
        }
        if (count1>0){
            count1=0;
            for (int i=0; i<nums.length;i++){
                if (nums[i]==major1)
                    count1++;
            }
        }
        if (count2>0){
            count2=0;
            for (int i=0; i<nums.length;i++){
                if (nums[i]==major2)
                    count2++;
            }
        }
        if (count1> (nums.length/3))
            result.add(major1);
        if (count2> (nums.length/3))
            result.add(major2);
        return result;
    }
}
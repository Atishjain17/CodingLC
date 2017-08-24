class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low=0,high=numbers.length-1;
        int sum;
        int [] result = new int [2];
        while (low<high){
            sum = numbers[low]+numbers[high];
            if(sum<target)
                low++;
            else if(sum==target) {
                result[0]=low+1;
                result[1]=high+1;
                break; }
            else
                high--;
        }
        return result;
    }
}
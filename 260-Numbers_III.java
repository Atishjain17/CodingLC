/* All twice, except two*/

/*
In the first pass, we XOR all elements in the array, and get the XOR of the 
two numbers we need to find. Note that since the two numbers are distinct, 
so there must be a set bit (that is, the bit with value '1') in the XOR result. 
Find out an arbitrary set bit (for example, the rightmost set bit).

In the second pass, we divide all numbers into two groups, one with the 
aforementioned bit set, another with the aforementinoed bit unset. Two different
numbers we need to find must fall into the two distrinct groups. XOR numbers in 
each group, we can find a number in either group.
*/



class Solution {
    public int[] singleNumber(int[] nums) {
        int xor =  0;
        for (int i=0; i<nums.length;i++){
            xor ^=nums[i];
        }
        xor &= -xor; //last-set-bit
        int [] result = {0,0};
        for (int i=0; i< nums.length;i++){
            if ((xor & nums[i]) == 0)
                result[0] ^= nums[i];
            else
                result[1] ^= nums[i];
        }
        return result;
    }
}
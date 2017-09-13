/*
b^(log_b_x) = x -->log_b_x means log x to the base b
log_b_x = log_a_x / log_a_b 
*/
/*This method only works for prime numbers*/

class Solution {
    public boolean isPowerOfThree(int n) {
    // 1162261467 is 3^19,  3^20 is bigger than int  
    //return ( n>0 &&  1162261467%n==0); 
    //Generalized for all base primes
    int maxPowerOfThree = (int)Math.pow(3, (int)(Math.log(0x7fffffff) / Math.log(3)));
    return (n>0 && maxPowerOfThree%n==0);
    }
} 
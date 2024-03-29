/*
Starting with any positive integer, replace the number by the sum 
of the squares of its digits, and repeat the process until the number 
equals 1 (where it will stay), or it loops endlessly in a cycle which 
does not include 1. Those numbers for which this process ends in 1 are 
happy numbers.
*/

class Solution {

    public boolean isHappy(int n) {
        
    int slow, fast;
    slow = fast = n;
    do {
        slow = digitSquareSum(slow);
        fast = digitSquareSum(digitSquareSum(fast));
    if (fast == 1) return true;
    } while(slow != fast);
        return false;     
    }

    int digitSquareSum(int n) {
    int sum = 0, tmp;
    while (n!=0) {
        tmp = n % 10;
        sum += tmp * tmp;
        n /= 10;
    }
    return sum;
}
    
}
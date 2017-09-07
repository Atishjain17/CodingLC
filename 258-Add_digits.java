/*Add digits with recursion/loop till you get 1 digit*/
class Solution {
    public int addDigits(int num) {
        int result = (num-1) % 9;
        return result +1;
    }
}
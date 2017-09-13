//In O(n) and not O(n*size of int)
class Solution {
    public int[] countBits(int num) {
    int[] ans = new int[num + 1];
    for(int i=0; i<=num;i++){
        ans[i] = ans[i/2] + (i%2); //i.e. ans[i>>1] + (i&1);
    }
    /*
    DP - > ans[i] = ans[i-offset] +1;
    
    int offset =1;
    for {
    if (offset *2 == i) offset *=2;
    ans[i] = ans[i-offset]+1;
    }
    */
    return ans;
    }
}
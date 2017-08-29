class Solution {
    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];
        for (int i=0;i<len;i++)
            dp[i][i]=1;
        
        for( int k=1;k<len;k++){
            for (int i=0,j=k;i<len && j<len;i++,j++)
                if(s.charAt(i) == s.charAt(j))
                    dp[i][j] = dp[i + 1][j-1] + 2;
                 else
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
            }
        return dp[0][len-1];
    }
}
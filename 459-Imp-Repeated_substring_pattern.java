/* Variant of kmp */
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int i=1,j=0,n=s.length();
        int [] lps = new int [n+1];
        while(i<n){
            if (s.charAt(i) == s.charAt(j)) lps[++i] = ++j;
            else if (j==0) i++;
            else j = lps[j];
        }
        return ( (lps[n]!=0) && (lps[n] % (n-lps[n])==0));
    }
}
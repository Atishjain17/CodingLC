class Solution {
    private int lo;
    private int maxlen;
    
    public String longestPalindrome(String s) {
     
        int len = s.length();
        if(len<2) return s;
        
        for (int i=0;i<len-1;i++)
        {            
            extend_palindrome(s,i,i);
            extend_palindrome(s,i,i+1);
        }
        return s.substring(lo,lo+maxlen);
    }
    
    private void extend_palindrome(String s, int j, int k){
        while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k)){
            j--;
            k++;
        }
        
        if( maxlen < k- j-1){
            lo = j+1;
            maxlen = k-lo;
        }
    }
}
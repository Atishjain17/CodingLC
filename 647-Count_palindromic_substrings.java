class Solution {
    private int count;
    public int countSubstrings(String s) {
        count = 0;
        int len = s.length();
        if(len<2) return len;
        
        for (int i=0;i<len;i++)
        {            
            extend_palindrome(s,i,i);
            extend_palindrome(s,i,i+1);
        }
        return count;
    }
    
    private void extend_palindrome(String s, int j, int k){
        while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k)){
            j--;
            k++;
            count ++;    
        }
        
    }
}
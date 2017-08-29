/*
public class Solution {
    public int lengthOfLongestSubstring(String s) {
    int maxLength =0;
    int start=0;
    int end=0;
    int count = 0;
    for (int i=0; i<s.length();i++){
        int contains = (s.substring(start,end)).indexOf(s.charAt(i));
        if(contains<0){
            count+=1;
            end = i+1;
        }
        else{
            start = start + contains +1;
            end = i+1;
            count = end - start;
        }
        
        maxLength = Math.max(maxLength,count);
    }
    return maxLength;
    }
}
*/

/*
keep a hashmap which stores the characters in string as keys and their positions
as values, and keep two pointers which define the max substring. move the right 
pointer to scan through the string , and meanwhile update the hashmap. If the 
character is already in the hashmap, then move the left pointer to the right of 
the same character last found. Note that the two pointers can only move forward.
*/
public class Solution {
   public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
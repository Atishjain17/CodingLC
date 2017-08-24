/*Find extra letter in 2 strings*/
class Solution {
    public char findTheDifference(String s, String t) {
        int ans = t.charAt(s.length());
        for (int i=0; i<s.length();i++){
            ans = ans^ s.charAt(i) ^ t.charAt(i);
        }
        return (char)ans;
    }
}
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder ();
        int n1=a.length()-1,n2=b.length()-1,c=0;
        while ( n1>=0 || n2>=0 || c>0){
            int sum = c + ((n1<0)?0:(a.charAt(n1--)-'0')); 
			sum += ((n2<0)?0:(b.charAt(n2--)-'0'));
            s.append(sum%2);
            c = sum/2;              
        }
        return s.reverse().toString();
    }
}

/* Using bitwise operators
int Add(int x, int y)
{
    // Iterate till there is no carry  
    while (y != 0)
    {
        // carry now contains common set bits of x and y
        int carry = x & y;  
 
        // Sum of bits of x and y where at least one of the bits is not set
        x = x ^ y; 
 
        // Carry is shifted by one so that adding it to x gives the required sum
        y = carry << 1;
    }
    return x;
}
*/
class Solution {
    public int reverse(int x) {
        
        int lastDigit = 0;
        boolean xIsNegative = false;
        int rev = 0;
        
        if(x == 0){return x;}
        
        if(x < 0)
        {
            x = x * -1;
            xIsNegative = true;
        }
        
        while (x != 0)
        {
            if(rev > Integer.MAX_VALUE/10 ||  rev < Integer.MIN_VALUE/10)
            {
                return 0;
            
            }
            
            lastDigit = x % 10; //Get Last Digit
            
            rev = (rev * 10) + lastDigit;
            
            
            
            x /= 10; //Remove last digit
             
        }
        
        if(xIsNegative)
        {
                rev = rev * -1;
        }
        return rev;
    }
        
    
    
}
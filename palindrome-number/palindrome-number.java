class Solution {
    public boolean isPalindrome(int x) {
        
        String str1 = Integer.toString(x);
        String str2 = "";
        char ch;
        
        for (int i=0; i<str1.length(); i++){
            ch= str1.charAt(i); 
            str2 = ch + str2; 
      }
        
        if(str1.equals(str2))
        {
            return true;
        }else
        {
            return false;
        }
    }
}
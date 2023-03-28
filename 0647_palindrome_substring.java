public class Solution {
    public static boolean isPalindrome(String str) {
    StringBuffer ab = new StringBuffer(str);
        ab.reverse();
        String c = ab.toString();
        if(str.equals(c))
        {
            return true;
        }
        else{
            return false;
        }
  }
    public int countSubstrings(String s) {
        int m=0;
          for (int i = 0 ; i < s.length(); i++) {
      for (int j = i + 1; j <= s.length(); j++) {
        // i -> starting point of substring, j-> ending point of substring
        if (isPalindrome(s.substring(i, j))==true) 
        {
            m++;
        }
         
      }
          }
        return m;
    }
     
} palindrome_substring {
    
}

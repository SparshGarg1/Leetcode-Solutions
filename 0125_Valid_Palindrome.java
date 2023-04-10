class Solution 
{
    public boolean isPalindrome(String s) 
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if((c>='a' && c<='z')||(c>='A' && c<='Z')|| Character.isDigit(c)) sb.append(c);
        }
       

          return (sb.toString().toLowerCase().equals(sb.reverse().toString().toLowerCase()));
           
    }
}
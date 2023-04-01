class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int c=0;
        while(c<s1.length() && c<s2.length())
        {
            if(s1.charAt(c)==s2.charAt(c))
            {
                c++;
            }
            else
            {
                break;
            }
        }
        return s1.substring(0,c);
    }
}
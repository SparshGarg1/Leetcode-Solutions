class Solution {
    public String reverseWords(String s) 
    {
        StringBuilder sb = new StringBuilder();
        String k[] = s.split(" ");
        for(int i=k.length-1; i>=0; i--)
        {
            if(k[i].isEmpty()) continue;
            sb.append(k[i]+" ");
            
        }
         return sb.toString().trim();
    }
}
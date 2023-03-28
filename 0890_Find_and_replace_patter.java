class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> al = new ArrayList<String>();
        int j = words.length -1;
        do
        {
            int r=0;
            String a = words[j];
            for(int i=0; i<pattern.length(); i++)
        {
            if(a.indexOf(a.charAt(i))==pattern.indexOf(pattern.charAt(i)))
            {
                r++;
            }
        }
            if(r==pattern.length())
            {
                al.add(a);
            }
            j--;
        }
        while(j>=0);
        return al;
    }
}
class Solution {

    class Pair{

        String first;
        int second;

        Pair(String first,int second){
            this.first=first;
            this.second=second;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        if(beginWord.equals(endWord))
          return 0;

        Set<String> set=new HashSet<>();
        for(String s:wordList)
          set.add(s);

        Queue<Pair> q=new LinkedList<>();

        q.add(new Pair(beginWord,1));

        while(!q.isEmpty()){

             String word=q.peek().first;
             int steps=q.peek().second;
             q.remove();

             if(word.equals(endWord))
               return steps;

             for(int i=0;i<word.length();i++){

                 for(char ch='a';ch<='z';ch++){

                      char []replacedArr=word.toCharArray();
                      replacedArr[i]=ch;
                      String replacedWord=new String(replacedArr);
                      if(set.contains(replacedWord))
                         {
                             set.remove(replacedWord);
                             q.add(new Pair(replacedWord,steps+1));
                         }
                 }
             }

        }    
       return 0;
    }
}

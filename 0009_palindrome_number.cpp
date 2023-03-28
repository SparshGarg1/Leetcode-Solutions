class Solution {
public:
    bool isPalindrome(int x) {
        long long m=x;
        long long rev_num=0;
        
        while(x!=0){
            rev_num=rev_num*10 + x%10;
            x=x/10;
        }
        if(m<0){
            return false;
        }
      else  if(m==rev_num){
            return true;
        }
        else {
            return false;
        }
    }
};
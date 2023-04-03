class Solution {
    public int numRescueBoats(int[] people, int limit) 
    {
        Arrays.sort(people);
        int nB=0;
        int s=0;
        int e = people.length - 1;
        while(s<=e)
        {
            if(people[s] + people[e] <= limit){
                s++;
                e--;
            }
            else{
                e--;
            }
            nB++;
        }
        return nB;
    }
}
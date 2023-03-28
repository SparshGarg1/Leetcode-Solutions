import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> al = new TreeSet<Integer>();
        for(int i : nums)
        {
            al.add(i);
        }
        int s = al.size();
        for(int i=0; i<s; i++)
        {
            nums[i] = al.pollFirst();
        }
        return s;
    }
}
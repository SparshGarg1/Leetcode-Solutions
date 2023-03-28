class Solution {
    public int majorityElement(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
         for(int key:map.keySet())

            {

                if(map.get(key)>(arr.length/2)) return key;

            }    
            return -1;
    }
}
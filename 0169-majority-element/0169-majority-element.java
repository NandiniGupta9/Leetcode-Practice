class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int max =0;
        int Max =0;
        for(int i : nums){
        int c= m.getOrDefault(i,0);
        m.put(i,c+1);
        }
         for (int i : m.keySet())
         {
            if(m.get(i)>max){
                max = m.get(i);
                Max=i;
            } 
         } 
         return Max;
    }
}
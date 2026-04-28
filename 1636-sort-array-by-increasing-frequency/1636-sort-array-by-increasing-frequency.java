import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }   
        List<Integer> list = new ArrayList<>();
        for (int n : nums) list.add(n);
        Collections.sort(list, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            
            if (freqA != freqB) {
                return freqA - freqB; 
            } else {
                return b - a; 
            }
        });
        return list.stream().mapToInt(i -> i).toArray();
    }
}
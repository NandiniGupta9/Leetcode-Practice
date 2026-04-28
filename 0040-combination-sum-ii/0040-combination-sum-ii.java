import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
      
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), results);
        return results;
    }

    private void backtrack(int[] nums, int remaining, int start, List<Integer> path, List<List<Integer>> results) {
        
        if (remaining == 0) {
            results.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            
            if (nums[i] > remaining) break;


            if (i > start && nums[i] == nums[i - 1]) continue;

            path.add(nums[i]);
           
            backtrack(nums, remaining - nums[i], i + 1, path, results);
           
            path.remove(path.size() - 1);
        }
    }
}
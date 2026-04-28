class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        
        
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        
        int result = high;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canEatAll(piles, h, mid)) {
                result = mid; 
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }
        
        return result;
    }
    
    
    private boolean canEatAll(int[] piles, int h, int k) {
        long totalHours = 0; 
        for (int pile : piles) {
           
            totalHours += (pile + k - 1) / k;
        }
        return totalHours <= h;
    }
}
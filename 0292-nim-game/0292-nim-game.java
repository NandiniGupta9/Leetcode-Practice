class Solution {
    public boolean canWinNim(int n) {
        // You lose if n is divisible by 4
        return n % 4 != 0;
    }
}
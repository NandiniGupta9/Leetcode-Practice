class Solution {
    public int bulbSwitch(int n) {
        // The number of bulbs on is the number of perfect squares <= n
        return (int) Math.sqrt(n);
    }
}
class Solution {
    public int searchInsert(int[] a, int t) {
         int len = a.length;
        int s = 0;
        int e = len - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (a[mid] < t) {
                s=mid+1;
            }
            else if (a[mid] > t) {
                e=mid-1;
            }
            else if (a[mid] == t) {
                return mid;
            }
        }
        return s;
    }
}
class Solution {
    public boolean isPowerOfFour(int n) {
        int k = 1;
        for(int i = 0; i < 15 && k < n; i++){
                k = (k << 2);
        }
        return n == k;
    }
}
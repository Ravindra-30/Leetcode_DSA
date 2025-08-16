class Solution {
    public int minSensors(int n, int m, int k) {
        int cover = (2 * k) + 1;
        int h = (n/cover) + (n % cover > 0? 1: 0); 
        int v = (m/cover) + (m % cover > 0? 1: 0); 
        return h * v;
    }
}
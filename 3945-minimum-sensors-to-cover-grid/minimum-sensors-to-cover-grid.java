class Solution {
    public int minSensors(int n, int m, int k) {
        int cover = (2 * k) + 1;
        int h = (int)Math.ceil(((double)n) / cover);
        int v = (int)Math.ceil(((double)m) / cover);
        return h * v;
    }
}
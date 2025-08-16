class Solution {
    public long perfectPairs(int[] nums) {
        int n = nums.length;
        long c = 0, z = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                nums[i] = -nums[i];
            }
            else if(nums[i] == 0){
                z++;
            }
        }
        c = (z * (z - 1))/2;
        Arrays.sort(nums);
        int i = (int)z, j = i;
        while(i < n - 1){
            if(j < n && nums[j] <= 2 * nums[i]){
                j++;
            }
            else{
                c += j - i - 1;
                i++;
            }
        }
        return c;
    }
}
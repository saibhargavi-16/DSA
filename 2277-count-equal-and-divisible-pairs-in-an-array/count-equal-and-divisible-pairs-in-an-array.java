class Solution {
    public int countPairs(int[] nums, int k) {
        int res=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int s=i*j;
                if(nums[i]==nums[j] && s%k==0) res++;
            }
        }
        return res;
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        int mx=nums[0],s=nums[0];
        for(int i=1;i<nums.length;i++){
            s=Math.max(nums[i],s+nums[i]);
            mx=Math.max(mx,s);
            if(s<0) s=0;
        }
        return mx;
    }
}
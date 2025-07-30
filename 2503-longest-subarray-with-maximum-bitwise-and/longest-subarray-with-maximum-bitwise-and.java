class Solution {
    public int longestSubarray(int[] nums) {
        int mx=0,ans=0,c_s=0;
        for(int i=0;i<nums.length;i++){
            if(mx<nums[i]){
                mx=nums[i];
                ans=0; c_s=0;
            }
            if(mx==nums[i]){
                c_s++;
            }
            else c_s=0;
            ans=Math.max(ans,c_s);
        }
        return ans;
    }
}
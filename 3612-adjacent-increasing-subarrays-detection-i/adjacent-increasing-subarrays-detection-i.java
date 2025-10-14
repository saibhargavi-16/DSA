class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n=nums.size();
        int c=1,p=0,ans=0;
        for(int i=1;i<n;++i){
            if(nums.get(i)>nums.get(i-1)){
                ++c;
            }
            else{
                p=c;
                c=1;
            }
            ans=Math.max(ans,Math.min(p,c));
            ans=Math.max(ans,c/2);
        }
        return ans>=k;
    }
}
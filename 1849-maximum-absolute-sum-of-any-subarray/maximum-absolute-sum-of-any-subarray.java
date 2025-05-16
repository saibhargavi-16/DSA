class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int mx=nums[0],s=nums[0],r=nums[0],mn=nums[0];
        for(int i=1;i<nums.length;i++){
            s+=nums[i];
            mx=Math.max(s,mx);
            mn=Math.min(s,mn);
            if(s>=0) r=Math.max(r,Math.max(s,s-mn));
            else r=Math.max(r,Math.max(Math.abs(s),Math.abs(s-mx)));
        }
        //mx=Math.abs(mx); mn=Math.abs(mn);
        return Math.abs(r);
    }
}
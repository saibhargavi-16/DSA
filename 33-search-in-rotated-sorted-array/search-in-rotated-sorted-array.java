class Solution {
    public int search(int[] nums, int t) {
        int s=0,e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==t) return m;
            if(nums[m]>=nums[s]){
                if(t>=nums[s] && t<nums[m]){
                    e=m-1;
                }
                else s=m+1;
            }
            else{
                if(t>nums[m] && t<=nums[e]){
                    s=m+1;
                }
                else e=m-1;
            }
        }
        return -1;
    }
}
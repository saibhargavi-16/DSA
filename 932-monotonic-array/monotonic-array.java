class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isInc=true;
        boolean isDec=true;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]) isDec=false;
            if(nums[i]<nums[i-1]) isInc=false;
        }
        return isInc||isDec;
    }
}
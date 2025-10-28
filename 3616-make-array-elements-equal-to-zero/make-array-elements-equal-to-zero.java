class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int c=0;
        int s=0;
        for(int x:nums) s+=x;
        int lSum=0;
        int rSum=s;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                if(lSum-rSum>=0 && lSum-rSum<=1) c++;
                if(rSum-lSum>=0 && rSum-lSum<=1) c++;
            }
            else{
                lSum+=nums[i];
                rSum-=nums[i];
            }
        }
        return c;
    }
}
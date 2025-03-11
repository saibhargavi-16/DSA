class Solution {
    public int pivotIndex(int[] nums) {
        int tS=0;
        for(int n:nums){
            tS+=n;
        }
        int lS=0;
        for(int i=0;i<nums.length;i++){
            if(lS==tS-lS-nums[i]){
                return i;
            }
            lS+=nums[i];
        }
        return -1;
    }
}
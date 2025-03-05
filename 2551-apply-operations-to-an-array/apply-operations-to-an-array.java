class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int idx=0;
        for(int n1:nums){
            if(n1!=0){
                nums[idx++]=n1;
            }
        }
        while(idx<n){
            nums[idx++]=0;
        }
        return nums;
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int n:nums){
            if(n!=0){
                nums[i++]=n;
            }
        }
        while(i<nums.length){
            nums[i++]=0;
        }
    }
}
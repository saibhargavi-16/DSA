class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i-2]==0){
                c++;
                nums[i-2]=nums[i-2]^1;
                nums[i-1]=nums[i-1]^1;
                nums[i]=nums[i]^1;
            }
        }
        int s=0;
        for(int n:nums) s+=n;
        if(s==nums.length) return c;
        return -1;
    }
}
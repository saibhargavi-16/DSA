class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public void reverse(int[] nums,int l,int h){
        while(l<h){
            int t=nums[l];
            nums[l]=nums[h];
            nums[h]=t;
            l++;
            h--;
        }
    }
}
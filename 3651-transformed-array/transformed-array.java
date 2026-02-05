class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0) res[i]=nums[i];
            else{
                int s=nums[i];
                int dest=(i+s%n+n)%n;
                res[i]=nums[dest];
            }
        }
        return res;
    }
}
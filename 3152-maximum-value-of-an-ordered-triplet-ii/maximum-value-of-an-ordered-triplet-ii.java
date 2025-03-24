class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        if(n<3) return 0;
        int max=nums[0];
        long bestP=Long.MIN_VALUE;
        long maxTri=Long.MIN_VALUE;
        for(int j=0;j<n-1;j++){
            bestP=Math.max(bestP,max-nums[j]);
            maxTri=Math.max(maxTri,bestP*nums[j+1]);
            max=Math.max(max,nums[j]);
        }
        return Math.max(maxTri,0);
    }
}
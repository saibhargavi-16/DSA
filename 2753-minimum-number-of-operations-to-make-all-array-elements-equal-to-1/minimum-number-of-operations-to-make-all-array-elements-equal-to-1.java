class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i:nums){
            if(i==1) c++;
        }
        if(c>0) return nums.length-c;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int g=nums[i];
           for(int j=i+1;j<nums.length;j++){
            g=gcd(g,nums[j]);
            if(g==1){
                ans=Math.min(ans,j-i); break;
            }
           }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans+nums.length-1;
    }
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
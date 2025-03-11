class Solution {
    public int findGCD(int[] nums) {
        int mn=nums[0],mx=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>mx) mx=nums[i];
            if(nums[i]<mn) mn=nums[i];
        }
        //System.out.println(mx+" "+mn);
        int res=0;
        for(int i=1;i<=mx;i++){
            if(mn%i==0 && mx%i==0) res=i;
        }
        return res;
    }
}
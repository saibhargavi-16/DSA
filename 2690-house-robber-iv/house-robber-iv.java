class Solution {
    public int minCapability(int[] nums, int k) {
        int l=1;
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>r) r=nums[i];
        }
        int tH=nums.length;
        while(l<r){
            int m=(l+r)/2;
            int hR=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=m){
                    hR++;
                    i++;
                }
            }
            if(hR>=k) r=m;
            else l=m+1;
        }
        return  l;
    }
}
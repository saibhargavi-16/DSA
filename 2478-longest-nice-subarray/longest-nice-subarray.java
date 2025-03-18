class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l=0,r=nums.length;
        int res=1;
        while(l<=r){
            int m=(l+r)/2;
            if(helper(m,nums)){
                res=m;
                l=m+1;
            }
            else r=m-1;
        }
        return res;
    }
    public boolean helper(int l,int[] nums){
        if(l<=1) return true;
        for(int i=0;i<=nums.length-l;++i){
            int b=0;
            boolean isNice=true;
            for(int j=i;j<i+l;++j){
                if((b&nums[j])!=0){
                    isNice=false;
                    break;
                }
                b|=nums[j];
            }
            if(isNice) return true;
        }
        return false;
    }
}
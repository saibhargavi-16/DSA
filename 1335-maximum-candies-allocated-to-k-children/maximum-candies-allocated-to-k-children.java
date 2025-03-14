class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l=1;
        int r=(int)1e7;
        int res=0;
        while(l<=r){
            int m=l+(r-l)/2;
            if(canAllocate(candies,k,m)){
                res=m;
                l=m+1;
            }
            else r=m-1;
        }
        return res;
    }
    public boolean canAllocate(int[] c,long k,int m){
        long count=0;
        for(int ca:c){
            count+=ca/m;
            if(count>=k) return true;
        }
        return count>=k;
    }
}
class Solution {
    public int mirrorDistance(int n) {
        int ans=reverse(n);
        return Math.abs(n-ans);
    }
    public int reverse(int n){
        int ans=0;
        while(n>0){
            int r=n%10;
            ans=ans*10+r;
            n=n/10;
        }
        return ans;
    }
}
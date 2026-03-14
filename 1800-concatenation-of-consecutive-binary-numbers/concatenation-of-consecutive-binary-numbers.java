class Solution {
    public int concatenatedBinary(int n) {
       long mod=1000000007;
       long ans=0;
       int b=0;
       for(int i=1;i<=n;i++){
        if((i&(i-1))==0) b++;
        ans=((ans<<b)+i)%mod;
       }
       return (int)ans;
    }
}
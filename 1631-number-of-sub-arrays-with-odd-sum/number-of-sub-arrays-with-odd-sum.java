class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod=1000000007;
        int eC=1,oC=0,res=0,s=0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
            if(s%2==0){
                eC++;
                res=(res+oC)%mod;
            }
            else{
                oC++;
                res=(res+eC)%mod;
            }
        }
        return res;
    }
}
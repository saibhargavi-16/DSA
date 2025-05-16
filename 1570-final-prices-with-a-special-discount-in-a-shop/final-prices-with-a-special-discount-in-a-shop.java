class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;

        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=prices[i];
            int s=prices[i];
            int j=i+1;
            while(j<n){
                int r=0;
                r=prices[j];
                if(r<=s){
                    ans[i]=Math.abs(s-r);
                    break;
                }
                else    j++;
            }
            //if(ans[i]==0) ans[i]=prices[i];
        }
        return ans;
    }
}
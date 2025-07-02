class Solution {
    public int maxProfit(int[] prices) {
        int res=prices[0];
        int s=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<res) res=prices[i];
            else s=Math.max(s,prices[i]-res);
        }
        return s;
    }
}
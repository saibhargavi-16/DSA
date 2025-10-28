class Solution {
    public int buyChoco(int[] prices, int money) {
        int s=0;
        Arrays.sort(prices);
        s+=prices[0];
        s+=prices[1];
        if(s<=money){
            money=money-s;
        }
        return money;
    }
}
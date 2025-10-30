class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int s=numBottles;
        while(numBottles>=numExchange){
            int rem=numBottles/numExchange;
            s+=rem;
            numBottles=rem+(numBottles%numExchange);
        }
        return s;
    }
}
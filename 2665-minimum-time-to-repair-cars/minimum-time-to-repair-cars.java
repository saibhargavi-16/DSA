class Solution {
    public long repairCars(int[] ranks, int cars) {
        int minR=ranks[0],maxR=ranks[0];
        for(int r:ranks){
            minR=Math.min(minR,r);
            maxR=Math.max(maxR,r);
        }
        int[] freq=new int[maxR+1];
        for(int r:ranks){
            minR=Math.min(minR,r);
            freq[r]++;
        }
        long l=1,h=1L*minR*cars*cars;
        while(l<h){
            long m=(l+h)/2;
            long carsR=0;
            for(int i=1;i<=maxR;i++){
                carsR+=freq[i]*(long) Math.sqrt(m/(long) i);
            }
            if(carsR>=cars){
                h=m;
            }
            else l=m+1;
        }
        return l;
    }
}
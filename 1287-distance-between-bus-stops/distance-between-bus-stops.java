class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n=0,n1=0;
        if(start>destination){
            int temp=destination;
            destination=start;
            start=temp;
        }
        for(int i=start;i<destination;i++){
            n+=distance[i];
        }
        for(int i=0;i<distance.length;i++){
            n1+=distance[i];
        }
        n1=n1-n;
        //System.out.println(n);
        //System.out.println(n1);
        return Math.min(n,n1);
    }
}
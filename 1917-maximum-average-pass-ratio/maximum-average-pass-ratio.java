class Solution {
    private double gain(int p,int t){
        return (double)(p+1)/(t+1) - (double)p/t;
    }
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->Double.compare(gain(b[0],b[1]),gain(a[0],a[1])));
        for(int[] c:classes){
            pq.offer(new int[]{c[0],c[1]});
        }
        while(extraStudents-->0){
            int[] b=pq.poll();
            b[0]++;
            b[1]++;
            pq.offer(b);
        }
        double s=0.0;
        while(!pq.isEmpty()){
            int[] c=pq.poll();
            s+=(double)c[0]/c[1];
        }
        return s/classes.length;
    }
}
class Solution {
    public int countDays(int days, int[][] meetings) {
        int fD=0;
        int lE=0;
        Arrays.sort(meetings,Comparator.comparingInt(a->a[0]));
        for(int [] m:meetings){
            int s=m[0],e=m[1];
            if(s>lE+1){
                fD+=s-lE-1;
            }
            lE=Math.max(lE,e);
        }
        fD+=days-lE;
        return fD;
    }
}
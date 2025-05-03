class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int res=check(tops[0],tops,bottoms);
        if(res!=-1 || tops[0]==bottoms[0]) return res;
        return check(bottoms[0],tops,bottoms);
    }
    private int check(int n,int tops[],int bottoms[]){
        int rT=0,rB=0;
        for(int i=0;i<tops.length;i++){
            if(tops[i]!=n && bottoms[i]!=n){
                return -1;
            }
            if(tops[i]!=n) rT++;
            if(bottoms[i]!=n) rB++;
        }
        return Math.min(rT,rB);
    }
}
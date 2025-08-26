class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int mx=0,ma=0;
        for(int i=0;i<dimensions.length;i++){
            int l=dimensions[i][0];
            int b=dimensions[i][1];
            int d=(l*l+b*b);
            int a=l*b;
            if(d>mx){
                mx=d;
                ma=a;
            }
            if(mx==d){
                ma=Math.max(ma,a);
            }
        }
        return ma;
    }
}
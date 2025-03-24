class Solution {
    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++){
        int lSum=0;
        int rSum=0;
            for(int j=1;j<=i;j++) lSum+=j;
            for(int k=i;k<=n;k++) rSum+=k;
            if(lSum==rSum) return i;
        }
        return -1;
    }
}
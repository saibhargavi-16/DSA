class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int n1=baskets.length;
        int u=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n1;j++){
                if(fruits[i]<=baskets[j]){
                    u-=1;
                    baskets[j]=-1;
                    break;
                }
            }
        }
        return u;
        
    }
}
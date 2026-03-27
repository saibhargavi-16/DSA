class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        k=k%m;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int curr=j;
                int f;
                if(i%2==0){
                    f=(j+k)%m;
                }
                else{
                    f=(j-k+m)%m;
                }
                if(mat[i][curr]!=mat[i][f]) return false;
            }
        }
        return true;
    }
}
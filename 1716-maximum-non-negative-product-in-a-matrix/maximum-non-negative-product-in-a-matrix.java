class Solution {
    public int maxProductPath(int[][] grid) {
        long mod=1000000007;
        int m=grid.length;
        int n=grid[0].length;
        long[][] mx=new long[m][n];
        long[][] mn=new long[m][n];
        mx[0][0]=mn[0][0]=grid[0][0];
        for(int i=1;i<m;i++){
            mx[i][0]=mn[i][0]=mx[i-1][0]*grid[i][0];
        }
        for(int i=1;i<n;i++){
            mx[0][i]=mn[0][i]=mx[0][i-1]*grid[0][i];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                long val = grid[i][j];

                long a = mx[i - 1][j];
                long b = mn[i - 1][j];
                long c = mx[i][j - 1];
                long d = mn[i][j - 1];

                long maxVal = Math.max(
                        Math.max(a * val, b * val),
                        Math.max(c * val, d * val)
                );

                long minVal = Math.min(
                        Math.min(a * val, b * val),
                        Math.min(c * val, d * val)
                );

                mx[i][j] = maxVal;
                mn[i][j] = minVal;
            }
        }
        if(mx[m-1][n-1]<0) return -1;
        else return (int)(mx[m-1][n-1]%mod);
    }
}
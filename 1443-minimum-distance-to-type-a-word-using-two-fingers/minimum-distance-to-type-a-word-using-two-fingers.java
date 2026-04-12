class Solution {
    public int minimumDistance(String word) {
        int n=word.length();
        Integer[][] dp=new Integer[n][27];
        return helper(word,0,26,dp);
    }
    private int helper(String word,int i,int j,Integer [][] dp){
        if(i==word.length()) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        int curr=word.charAt(i)-'A';
        int c1=0;
        if(i>0){
            int p=word.charAt(i-1)-'A';
            c1=dist(p,curr);
        }
        int res1=c1+helper(word,i+1,j,dp);
        int c2=(j==26)?0:dist(j,curr);
        int res2=c2+helper(word,i+1,(i>0?word.charAt(i-1)-'A':26),dp);
        return dp[i][j]=Math.min(res1,res2);
    }
    private int dist(int a,int b){
        int r1=a/6,c1=a%6;
        int r2=b/6,c2=b%6;
        return Math.abs(r1-r2)+Math.abs(c1-c2);
    }
}
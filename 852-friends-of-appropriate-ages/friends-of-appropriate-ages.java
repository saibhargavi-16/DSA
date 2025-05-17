class Solution {
    public int numFriendRequests(int[] ages) {
        int[] c=new int[121];
        for(int i:ages) c[i]++;
        int ans=0;
        for(int i=0;i<=120;i++){
            int x=c[i];
            for(int j=0;j<=120;j++){
                int y=c[j];
                if(j<=(0.5*i)+7 || j>i || (j>100 && i<100)){
                    continue;
                }
                ans+=x*y;
                if(i==j) ans-=x;
            }
        }
        return ans;
    }
}
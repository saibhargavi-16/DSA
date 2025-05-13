class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int MOD=1000000007;
        long[] c=new long[26];
        for(char ch:s.toCharArray()){
            c[ch-'a']++;
        }
        for(int i=0;i<t;i++){
            long[] nc=new long[26];
            for(int j=0;j<26;j++){
                if(j==25){
                    nc[0]=(nc[0]+c[j])%MOD;
                    nc[1]=(nc[1]+c[j])%MOD;
                }
                else{
                    nc[j+1]=nc[j+1]+c[j]%MOD;
                }
            }
            c=nc;
        }
        long l=0;
        for(long cnt:c){
            l=(l+cnt)%MOD;
        }
        return (int)l;
    }
}
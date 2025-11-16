class Solution {
    public int numSub(String s) {
        final int M=1000000007;
        long t=0,len=s.length(),c=0;
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                t+=(c*(c+1))/2;
                t%=M;
                c=0;
            }
            else c++;
        }
        t+=(c*(c+1))/2;
        t%=M;
        return (int)t;
    }
}
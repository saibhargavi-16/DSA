class Solution {
    public int divisorSubstrings(int num, int k) {
        int c=0;
        String s=Integer.toString(num);
        for(int i=0;i<s.length()-k+1;i++){
            String t=s.substring(i,i+k);
            int n=Integer.valueOf(t);
            if(n==0) continue;
            if(num%n==0) c++;
        }
        return c;
    }
}
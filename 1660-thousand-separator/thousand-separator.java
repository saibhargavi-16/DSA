class Solution {
    public String thousandSeparator(int n) {
        if(n<1000) return Integer.toString(n);
        StringBuilder sb=new StringBuilder();
        int s=0;
        while(n>0){
            int rem=n%10;
            sb.append(rem);
            n=n/10;
            s++;
            if(s%3==0 && n>0){
                sb.append(".");
            }
        }
        StringBuilder rvsb=sb.reverse();
        return rvsb.toString();
    }
}
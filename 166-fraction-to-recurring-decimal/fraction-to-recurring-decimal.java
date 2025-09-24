class Solution {
    public String fractionToDecimal(int n, int d) {
        if(n==0) return "0";
        StringBuilder sb=new StringBuilder();
        if((n<0)^(d<0)) sb.append("-");
        long num=Math.abs((long)n);
        long den=Math.abs((long)d);
        sb.append(num/den);
        long r=num%den;
        if(r==0) return sb.toString();
        sb.append(".");
        Map<Long,Integer> mp=new HashMap<>();
        while(r!=0){
            if(mp.containsKey(r)){
                int i=mp.get(r);
                sb.insert(i,"(");
                sb.append(")");
                break;
            }
            mp.put(r,sb.length());
            r*=10;
            sb.append(r/den);
            r%=den;
        }
        return sb.toString();
        
    }
}
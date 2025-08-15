class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> res=new ArrayList<>();
        int n=s.length();
        int c=0;
        while(c<n){
            int e=Math.min(c+k,n);
            res.add(s.substring(c,e)); c+=k;
        }
        String l=res.get(res.size()-1);
        if(l.length()<k){
            l+=String.valueOf(fill).repeat(k-l.length());
            res.set(res.size()-1,l);
        }
        return res.toArray(new String[0]);
    }
}
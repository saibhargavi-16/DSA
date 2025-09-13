class Solution {
    public int maxFreqSum(String s) {
        String v="aeiou";
        Map<Character,Integer> f=new HashMap<>();
        for(char ch:s.toCharArray()){
            f.put(ch,1+f.getOrDefault(ch,0));
        }
        int cV=0,cC=0;
        for(Map.Entry<Character,Integer> e:f.entrySet()){
            char ch=e.getKey();
            int n=e.getValue();
            if(v.indexOf(ch)>=0) cV=Math.max(cV,n);
            else cC=Math.max(cC,n);
        }
        return cV+cC;
    }
}
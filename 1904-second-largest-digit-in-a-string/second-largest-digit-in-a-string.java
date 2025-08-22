class Solution {
    public int secondHighest(String s) {
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                hs.add(Character.getNumericValue(ch));
            }
        }
        int mx=-1;
        List<Integer> ss=new ArrayList<>(hs);
        Collections.sort(ss,Collections.reverseOrder());
        if(ss.size()>=2){
            mx=ss.get(1);
        }
        return mx;
    }
}
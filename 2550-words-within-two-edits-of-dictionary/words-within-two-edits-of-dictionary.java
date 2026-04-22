class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<dictionary.length;j++){
                String s=dictionary[j];
                String str=queries[i];
                int c=diffLetters(s,str);
                if(c<=2){
                    ans.add(queries[i]);
                    break;
                }
            }
        }
        return ans;
    }
    public int diffLetters(String s,String str){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=str.charAt(i)) c++;
        }
        return c;
    }
}
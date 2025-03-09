class Solution {
    public List<String> commonChars(String[] words) {
        //List<String> ans=new ArrayList<>();
        int[] cC=new int[26];
        for(char c:words[0].toCharArray()){
            cC[c-'a']++;
        }
        for(int i=1;i<words.length;i++){
            int[] c=new int[26];
            for(char ch:words[i].toCharArray()){
                c[ch-'a']++;
            }
            for(int j=0;j<26;j++) cC[j]=Math.min(cC[j],c[j]);
        }
        List<String> ans=new ArrayList<>();
        for(int i=0;i<26;i++){
            while(cC[i]>0){
                ans.add(String.valueOf((char)(i+'a')));
                cC[i]--;
            }
        }
        return ans;
    }
}
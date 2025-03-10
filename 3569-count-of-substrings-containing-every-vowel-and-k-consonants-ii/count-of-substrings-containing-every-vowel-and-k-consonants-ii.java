class Solution {
    public long countOfSubstrings(String word, int k) {
        long nVS=0;
        int s=0,e=0;
        HashMap<Character,Integer> vC=new HashMap<>();
        int cC=0;
        int[] nC=new int[word.length()];
        int nCI=word.length();
        for(int i=word.length()-1;i>=0;i--){
            nC[i]=nCI;
            if(!isVowel(word.charAt(i))) nCI=i;
        }
        while(e<word.length()){
            char nL=word.charAt(e);
            if(isVowel(nL)){
                vC.put(nL,vC.getOrDefault(nL,0)+1);
            }
            else{
                cC++;
            }
            while(cC>k){
                char sL=word.charAt(s);
                if(isVowel(sL)){
                    vC.put(sL,vC.get(sL)-1);
                    if(vC.get(sL)==0) vC.remove(sL);
                }
                else{
                    cC--;
                }
                s++;
            }
            while(s<word.length()&&vC.keySet().size()==5&&cC==k){
                nVS+=nC[e]-e;
                char sL=word.charAt(s);
                if(isVowel(sL)){
                    vC.put(sL,vC.get(sL)-1);
                    if(vC.get(sL)==0) vC.remove(sL);
                }
                else cC--;
                s++;
            }
            e++;
        }
        return nVS;
    }
    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o'||c=='u';
    }
}
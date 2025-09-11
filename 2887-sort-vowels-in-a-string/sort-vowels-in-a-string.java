class Solution {
    public String sortVowels(String s) {
        List<Character> v=new ArrayList<>();
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                v.add(ch);
            }
        }
        Collections.sort(v);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                sb.append(v.get(j));
                j++;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') return true;
        return false;
    }
}
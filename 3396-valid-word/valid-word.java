class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        String isVowel="aeiouAEIOU";
        String isDigit="0123456789";
        boolean v=false,c=false,d=false;
        for(char ch:word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)) return false;
            if(Character.isLetter(ch)){
                if(isVowel.indexOf(ch)!=-1) v=true;
                else c=true;
            }
        }
       return v&&c;
    }
}
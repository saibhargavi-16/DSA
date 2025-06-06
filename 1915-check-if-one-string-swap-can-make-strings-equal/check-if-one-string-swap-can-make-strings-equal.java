class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int c=0;
        int l=s1.length();
        if(s1.equals(s2)) return true;
        char[] s1f=new char[26];
        char[] s2f=new char[26];
        for(int i=0;i<l;i++){
            char s1c=s1.charAt(i);
            char s2c=s2.charAt(i);
            if(s1c!=s2c){
                c++;
                if(c>2) return false;
            }
            s1f[s1c-'a']++;
            s2f[s2c-'a']++;
        }
        return Arrays.equals(s1f,s2f);
    }
}
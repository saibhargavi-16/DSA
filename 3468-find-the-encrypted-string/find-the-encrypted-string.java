class Solution {
    public String getEncryptedString(String s, int k) {
        int l=s.length();
        k%=l;
        s=s+s;
        return s.substring(k,k+l);
    }
}
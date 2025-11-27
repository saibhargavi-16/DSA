class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,mxL=0;
        HashSet<Character> chS=new HashSet<>();
        for(int r=0;r<s.length();r++){
            while(chS.contains(s.charAt(r))){
                chS.remove(s.charAt(l));
                l++;
            }
            chS.add(s.charAt(r));
            mxL=Math.max(mxL,r-l+1);
        }
        return mxL;
    }
}
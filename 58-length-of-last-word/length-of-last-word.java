class Solution {
    public int lengthOfLastWord(String s) {
        String w[]=s.split(" ");
        int l=w[w.length-1].length();
        return l;
    }
}
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0,r=letters.length-1;
        int f=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(letters[m]>target){
                f=m;
                r=m-1;
            }
            else l=m+1;
        }
        if(f==-1) return letters[0];
        return letters[l];
    }
}
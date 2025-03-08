class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int minOp=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W') minOp++;
        }
        int currOp=minOp;
        for(int i=k;i<n;i++){
            if(blocks.charAt(i-k)=='W') currOp--;
            if(blocks.charAt(i)=='W') currOp++;
            minOp=Math.min(minOp,currOp);
        }
        return minOp;
    }
}
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n=operations.length;
        int c=0;
        for(int i=0;i<n;i++){
            String s=operations[i];
            if("X++".equals(s) || "++X".equals(s)){
                c++;
            }
            else{
                c--;
            }
        }
        return c;
    }
}
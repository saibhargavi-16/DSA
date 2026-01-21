class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(fDigit(n)==i){
                return i;
            }
        }
        return -1;
    }
    public int fDigit(int n){
        int res=0;
        while(n>0){
            int rem=n%10;
            res+=rem;
            n=n/10;
        }
        return res;
    }
}
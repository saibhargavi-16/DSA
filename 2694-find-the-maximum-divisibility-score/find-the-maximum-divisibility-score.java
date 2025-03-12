class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int mx=-1;
        int bD=Integer.MAX_VALUE;
        for(int d:divisors){
            int mn=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]%d==0){
                    mn++;
                }
            }
            if(mn>mx||mx==mn && d<bD){
                mx=mn;
                bD=d;
            }
        }
        return bD;
    }
}
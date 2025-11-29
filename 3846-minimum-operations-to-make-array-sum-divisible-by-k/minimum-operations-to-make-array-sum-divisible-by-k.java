class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int n:nums){
            sum += n;
        }
        int rem = sum%k;
        if(rem==0) return 0;
        int min = Integer.MAX_VALUE;
        for(int n:nums){
            int mod = n%k;
            if(mod>=rem){
                min = Math.min(min,rem);
            }
            else{
                min = Math.min(min,mod+k-rem);
            }
        }
        return rem;
    }
}
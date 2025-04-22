class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int c=0,sum=0;
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        for(int j=0;j<n;j++){
            sum+=nums[j];
            c+=mp.getOrDefault(sum-k,0);
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return c;
    }
}
class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            int s=nums[i]+nums[i+1];
            if(hs.contains(s)){
                return true;
            }
            hs.add(s);
        }
        return false;
    }
}
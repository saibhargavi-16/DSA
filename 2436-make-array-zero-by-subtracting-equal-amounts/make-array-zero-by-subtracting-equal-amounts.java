class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> res=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) res.add(nums[i]);
        }
        return res.size();
    }
}
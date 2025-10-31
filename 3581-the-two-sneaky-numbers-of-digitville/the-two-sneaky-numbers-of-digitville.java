class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> ss=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) ss.add(nums[i]);
        }
        int[] ans=new int[ss.size()];
        for(int i=0;i<ss.size();i++){
            ans[i]=ss.get(i);
        }
        return ans;
    }
}
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans=new ArrayList<>();
        int pf=0;
        int len=nums.length;
        for(int i:nums){
            pf=((pf*2)+i)%5;
            ans.add(pf==0);
        }
        return ans;
    }
}
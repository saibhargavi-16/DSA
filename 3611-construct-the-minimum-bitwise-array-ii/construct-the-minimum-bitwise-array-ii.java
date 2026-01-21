class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int f=nums.get(i);
            int c=-1;
            int d=1;
            while((f&d)!=0){
                c=f-d;
                d<<=1;
            }
            ans[i]=c;
        }
        return ans;
    }
}
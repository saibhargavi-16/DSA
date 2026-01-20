class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int or=nums.get(i);
            int c=-1;
            for(int j=1;j<or;j++){
                if((j|(j+1))==or){
                    c=j;
                    break;
                }
            }
            ans[i]=c;
        }
        return ans;
    }
}
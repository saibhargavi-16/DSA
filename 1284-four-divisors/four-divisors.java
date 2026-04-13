class Solution {
    public int sumFourDivisors(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            int fC=0,fS=0;
            for(int j=1;j<=nums[i];j++){
                if(nums[i]%j==0){
                    fC++;
                    fS+=j;
                }
                if(fC>4) break;
            }
            if(fC==4){
                res+=fS;
            }
        }
        return res;
    }
}
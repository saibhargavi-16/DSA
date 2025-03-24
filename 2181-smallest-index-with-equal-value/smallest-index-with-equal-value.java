class Solution {
    public int smallestEqual(int[] nums) {
        int s=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i%10==nums[i]){
                s=i;
                break;
            }
        }
        return s;
    }
}
class Solution {
    public int findFinalValue(int[] nums, int original) {
        //int n=nums.length;
        Arrays.sort(nums);
        while(binSearch(nums,original)){
            original*=2;
        }
        return original;
    }
    public boolean binSearch(int[] nums,int o){
        int l=0,h=nums.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(nums[m]==o) return true;
            else if(nums[m]<o){
                l=m+1;
            }
            else h=m-1;
        }
        return false;
    }
}
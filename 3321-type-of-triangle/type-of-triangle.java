class Solution {
    public String triangleType(int[] nums) {
        String ans="";
        int s1=nums[0]+nums[1];
        int s2=nums[1]+nums[2];
        int s3=nums[2]+nums[0];
        if(s1>nums[2] && s2>nums[0] && s3>nums[1]){
            if(nums[0]==nums[1] && nums[1]==nums[2] && nums[2]==nums[0]) ans="equilateral";
            else if(nums[0]==nums[1] || nums[1]==nums[2] ||nums[2]==nums[0]) ans="isosceles";
            else ans="scalene";
        }
        else ans="none";
        return ans;
    }
}
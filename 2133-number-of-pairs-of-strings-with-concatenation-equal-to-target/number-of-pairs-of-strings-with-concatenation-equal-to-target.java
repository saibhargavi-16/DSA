class Solution {
    public int numOfPairs(String[] nums, String target) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            String s=nums[i];
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                String s1=nums[j];
                if((s+s1).equals(target)) c++;
            }
        }
        return c;
    }
}
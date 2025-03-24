class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c=0;
        int len=nums.size();
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(nums.get(i)+nums.get(j)<target) c++;
            }
        }
        return c;
    }
}
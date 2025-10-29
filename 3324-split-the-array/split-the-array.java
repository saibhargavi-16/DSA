class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i:mp.values()){
            if(i>2) return false;
        }
        return true;
    }

}
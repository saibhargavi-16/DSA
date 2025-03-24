class Solution {
    public int singleNumber(int[] nums) {
        int s=0;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i:nums){
            freq.put(i,1+freq.getOrDefault(i,0));
        }
        for(int k:freq.keySet()){
            if(freq.get(k)==1) s=k;
        }
        return s;
    }
}
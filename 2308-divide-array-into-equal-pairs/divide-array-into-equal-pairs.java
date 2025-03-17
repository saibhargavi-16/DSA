class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int n:nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        for(int n:freq.keySet()){
            if(freq.get(n)%2!=0){
                return false;
            }
        }
        return true;
    }
}
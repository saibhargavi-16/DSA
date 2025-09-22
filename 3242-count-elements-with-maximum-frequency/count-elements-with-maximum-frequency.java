class Solution {
    public int maxFrequencyElements(int[] nums) {
        int mx=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int mxF=0;
        for(int f:mp.values()){
            mxF=Math.max(mxF,f);
        }
        for(int i:mp.values()){
            if(i==mxF){
                mx++;
            }
        }
        return mxF*mx;
    }
}
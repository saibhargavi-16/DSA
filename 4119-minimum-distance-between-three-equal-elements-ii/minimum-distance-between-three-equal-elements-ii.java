class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,List<Integer>> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(!mp.containsKey(val)){
                mp.put(val,new ArrayList<>());
            }
            mp.get(val).add(i);
        }
        int min=Integer.MAX_VALUE;
        for(List<Integer> ls: mp.values()){
            if(ls.size()<3) continue;
            for(int i=0;i<=ls.size()-3;i++){
                int dist=2*(ls.get(i+2)-ls.get(i));
                min=Math.min(dist,min);
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}
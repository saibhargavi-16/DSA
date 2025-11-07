class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            freq.put(edges[i][0],freq.getOrDefault(edges[i][0],0)+1);
            freq.put(edges[i][1],freq.getOrDefault(edges[i][1],0)+1);
        }
        for(int i:freq.keySet()){
            if(freq.get(i)==edges.length) return i;
        }
        return -1;
    }
}
class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> canCon=new HashSet<>();
        for(int[] f:friendships){
            Map<Integer,Integer> mp=new HashMap<>();
            boolean C=false;
            for(int l:languages[f[0]-1]) mp.put(l,1);
            for(int l:languages[f[1]-1]){
                if(mp.containsKey(l)){
                    C=true;
                    break;
                }
            }
            if(!C){
                canCon.add(f[0]-1);
                canCon.add(f[1]-1);
            }
        }
        int max=0;
        int[] cnt=new int[n+1];
        for(int f:canCon){
            for(int l:languages[f]){
                cnt[l]++;
                max=Math.max(max,cnt[l]);
            }
        }
        return canCon.size()-max;
    }
}
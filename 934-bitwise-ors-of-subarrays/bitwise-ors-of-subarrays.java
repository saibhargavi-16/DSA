class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> ans=new HashSet();
        Set<Integer> c=new HashSet();
        c.add(0);
        for(int i:arr){
            Set<Integer> c2=new HashSet();
            for(int j:c){
                c2.add(i|j);
            }
            c2.add(i);
            c=c2;
            ans.addAll(c);
        }
        return ans.size();
    }
}
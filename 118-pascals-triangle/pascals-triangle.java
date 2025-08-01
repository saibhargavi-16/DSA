class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> r= new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i) r.add(1);
                else{
                    int s=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    r.add(s);
                }
            }
            ans.add(r);
        }
        return ans;
    }
}
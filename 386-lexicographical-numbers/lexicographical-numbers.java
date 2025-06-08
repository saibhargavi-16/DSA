class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans=new ArrayList<>();
        int cn=1;
        for(int i=0;i<n;i++){
            ans.add(cn);
            if(cn*10<=n) cn*=10;
            else{
                while(cn%10==9 || cn>=n){
                    cn/=10;
                }
                cn+=1;
            }
        }
        return ans;
    }
}
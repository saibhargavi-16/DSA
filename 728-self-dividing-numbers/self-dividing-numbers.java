class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isDivisible(i)){
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean isDivisible(int n){
        int temp=n;
        while(n>0){
            int rem=n%10;
            if(rem==0) return false;
            else if(temp%rem!=0){
                return false;
            }
            n=n/10;
        }
        return true;
    }
}
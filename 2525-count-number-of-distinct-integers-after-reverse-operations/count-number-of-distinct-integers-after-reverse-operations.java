class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int n:nums){
            st.add(n);
        }
        for(int n:nums){
            st.add(reverseInt(n));
        }
        return st.size();
    }
    public int reverseInt(int n){
        int s=0;
        while(n>0){
            //if(n%10==0) n=n/10;
            int rem=n%10;
            s=(s*10)+rem;
            n=n/10;
        }
        return s;
    }
}
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n=energy.length;
        int ans=Integer.MIN_VALUE;
        for(int i=n-k;i<n;i++){
            int s=0;
            for(int j=i;j>=0;j-=k){
                s+=energy[j];
                ans=Math.max(ans,s);
            }
        }
        return ans;
    }
}
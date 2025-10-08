class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length,m=potions.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int s=spells[i];
            int l=0,h=m-1,idx=m;
            while(l<=h){
                int mid=l+(h-l)/2;
                if((long)s*potions[mid]>=success){
                    idx=mid; h=mid-1;
                }
                else l=mid+1;
            }
            ans[i]=m-idx;
        }
        return ans;
    }
}
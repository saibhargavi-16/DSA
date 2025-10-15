class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n=nums.size();
        int[] l=new int[n];
        l[0]=1;
        for(int i=1;i<n;i++){
            if(nums.get(i)>nums.get(i-1)){
                l[i]=l[i-1]+1;
            }
            else{
                l[i]=1;
            }
        }
        int[] r=new int[n];
        r[n-1]=1;
        for(int i=n-2;i>=0;i--){
            if(nums.get(i)<nums.get(i+1)){
                r[i]=r[i+1]+1;
            }
            else{
                r[i]=1;
            }
        }
        int maxk=0;
        for(int i=0;i<n-1;i++){
            int k=Math.min(l[i],r[i+1]);
            maxk=Math.max(maxk,k);
        }
        return maxk;
    }
}
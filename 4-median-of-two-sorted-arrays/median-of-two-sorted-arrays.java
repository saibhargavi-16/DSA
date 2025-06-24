class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int t=m+n;
        int res[]=new int[t];
        for(int i=0;i<m;i++) res[i]=nums1[i];
        for(int i=0;i<n;i++) res[m+i]=nums2[i];
        Arrays.sort(res);
        int s=t/2;
        double ans=0;
        if(t%2==0){
            //System.out.println(res[s-1]+res[s]);
            ans=(res[s-1]+res[s])/2.0;
        }
        else ans=res[s];
        return ans;
    }
}
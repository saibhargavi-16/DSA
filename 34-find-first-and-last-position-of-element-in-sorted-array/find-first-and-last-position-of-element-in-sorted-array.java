class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] ans={-1,-1};
       int f=firstOcc(nums,target);
       ans[0]=f;
       int l=lastOcc(nums,target);
        ans[1]=l;
        return ans;
    }
    public static int firstOcc(int[] nums,int t){
        int n=nums.length,l=0,h=n-1,m=0;
        int ans=-1;
        while(l<=h){
            m=(l+h)/2;
            if(nums[m]==t){
                ans=m;
                h=m-1;
            }
            else if(t<nums[m]) h=m-1;
            else l=m+1;
        }
        return ans;
    }
    public static int lastOcc(int[] nums,int t){
        int n=nums.length,l=0,h=n-1,m=0;
        int ans=-1;
        while(l<=h){
            m=(l+h)/2;
            if(nums[m]==t){
                ans=m;
                l=m+1;
            }
            else if(t>nums[m]) l=m+1;
            else h=m-1;
        }
        return ans;
    }
}
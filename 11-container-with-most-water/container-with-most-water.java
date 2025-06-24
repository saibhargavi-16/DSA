class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,maxArea=0;
        while(l<r){
            int curr=Math.min(height[l],height[r])*(r-l);
            maxArea=Math.max(maxArea,curr);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return maxArea;
    }
}
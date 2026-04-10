class Solution {
    public int minimumDistance(int[] nums) {
        int sum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        int dist=Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                        sum=Math.min(sum,dist);
                    }
                }
            }
        }
        return (sum==Integer.MAX_VALUE)?-1:sum;
    }
}
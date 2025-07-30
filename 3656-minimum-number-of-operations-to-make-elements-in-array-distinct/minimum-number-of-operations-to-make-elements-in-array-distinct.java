class Solution {
    public int minimumOperations(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i+=3){
           if(checkUnique(nums,i)){
            return ans;
           }
           ans++;
        }
        return ans;
    }
    public boolean checkUnique(int[] nums,int st){
        HashSet<Integer> ss=new HashSet<>(); 
        for(int i=st;i<nums.length;i++){
            if(ss.contains(nums[i])) return false;
            ss.add(nums[i]);
        }
        return true;
    }
} 
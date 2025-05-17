class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> c=new HashMap<>();
        c.put(0,0); c.put(1,0); c.put(2,0);
        for(int n:nums){
            c.put(n,c.get(n)+1);
        }
        int i=0;
        for(int j=0;j<3;j++){
            int f=c.get(j);
            for(int k=0;k<f;k++){
                nums[i]=j;
                i++;
            }
        }
    }
}
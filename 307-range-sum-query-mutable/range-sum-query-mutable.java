class NumArray {
    int n;
    int blockSize;
    int[] nums;
    int[] blocks;
    public NumArray(int[] nums) {
        n=nums.length;
        this.nums=nums;
        blockSize=(int)Math.ceil(Math.sqrt(n));
        blocks=new int[blockSize];
        for(int i=0;i<n;i++){
            int idx=i/blockSize;
            blocks[idx]+=nums[i];
        }
    }
    
    public void update(int index, int val) {
        int idx=index/blockSize;
        blocks[idx]-=nums[index];
        nums[index]=val;
        blocks[idx]+=val;
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        int sB=left/blockSize;
        int eB=right/blockSize;
        if(sB==eB){
            for(int i=left;i<=right;i++){
                sum+=nums[i];
            }
        }
        else{
            int endOfStartBlock=((sB+1)*blockSize)-1;
            for(int i=left;i<=endOfStartBlock;i++){
                sum+=nums[i];
            }
            for(int i=sB+1;i<=eB-1;i++){
                sum+=blocks[i];
            }
            int startOfEndBlock=eB*blockSize;
            for(int i=startOfEndBlock;i<=right;i++){
                sum+=nums[i];
            }
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
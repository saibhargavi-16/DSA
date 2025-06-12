class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int res=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    int p=Math.abs(arr[i]-arr[j]);
                    int q=Math.abs(arr[j]-arr[k]);
                    int r=Math.abs(arr[i]-arr[k]);
                    if(p<=a && q<=b && r<=c) res++;
                }
            }
        }
        return res;
    }
}
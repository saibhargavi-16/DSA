class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        boolean isValid=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && arr[i]==2*arr[j]) isValid=true;
            }
        }
        return isValid;
    }
}
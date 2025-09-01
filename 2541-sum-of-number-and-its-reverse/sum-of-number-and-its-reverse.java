class Solution {
    private int reverse(int n) {
    return Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
}

    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num;i++){
            int rev=reverse(i);
            if(i+rev==num){
                return true;
            }
        }
        return false;
    }
}
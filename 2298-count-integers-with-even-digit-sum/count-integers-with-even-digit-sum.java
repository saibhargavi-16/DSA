class Solution {
    public int countEven(int num) {
        int c=0;
        for(int i=2;i<=num;i++){
            int s=sumOfDigits(i);
            if(s%2==0) c++;
        }
        return c;
    }
    public int sumOfDigits(int n){
        int s=0;
        while(n>0){
            int rem=n%10;
            s+=rem;
            n=n/10;
        }
        return s;
    }
}
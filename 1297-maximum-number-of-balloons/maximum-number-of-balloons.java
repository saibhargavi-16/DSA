class Solution {
    public int maxNumberOfBalloons(String text) {
        int bC=0,aC=0,lC=0,oC=0,nC=0;
        for(char ch:text.toCharArray()){
            if(ch=='b') bC++;
            if(ch=='a') aC++;
            if(ch=='l') lC++;
            if(ch=='o') oC++;
            if(ch=='n') nC++;
        }
        int res=0;
        while(bC>=1 && aC>=1 && lC>=2 && oC>=2 && nC>=1){
            res++;
            bC-=1; aC-=1; lC-=2;  oC-=2; nC-=1;
        }
        return res;
    }
}
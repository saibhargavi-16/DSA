class Solution {
    private int dS(int x){
        int s=0;
        while(x>0){
            int rem=x%10;
            s+=rem;
            x=x/10;
        }
        return s;
    }
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> grps=new HashMap<>();
        for(int i=1;i<=n;i++){
            int s=dS(i);
            grps.put(s,grps.getOrDefault(s,0)+1);
        }
        int mx=0;
        for(int i:grps.values()){
            mx=Math.max(mx,i);
        }
        int c=0;
        for(int i:grps.values()){
            if(i==mx) c++;
        }
        return c;
    }
}
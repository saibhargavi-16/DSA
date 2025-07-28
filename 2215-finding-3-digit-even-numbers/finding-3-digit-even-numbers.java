class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> hs=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j || j==k || k==i) continue;
                    else{
                        int num=digits[i]*100+digits[j]*10+digits[k];
                        if(num>=100 && num%2==0) hs.add(num);
                    }
                }
            }
        }
        List<Integer> ls=new ArrayList<>(hs);
        Collections.sort(ls);
        int[] res=new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            res[i]=ls.get(i);
        }
        return res;
    }
}
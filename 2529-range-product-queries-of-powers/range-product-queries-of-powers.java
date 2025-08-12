class Solution {
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> ls=new ArrayList<>();
        String s=Integer.toString(n,2);
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch=='1') ls.add(1<<i);
        }
        int arr[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int st=queries[i][0];
            int e=queries[i][1];
            long prod=1;
            for(int j=st;j<=e;j++){
                prod=(prod*ls.get(j))%((int)1e9+7);
            }
            arr[i]=(int)prod;
        }
        return arr;
    }
}
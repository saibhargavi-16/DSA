class Solution {
    public int bitwiseComplement(int n) {
        String b=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder();
        for(char ch:b.toCharArray()){
            if(ch=='0') sb.append('1');
            else sb.append('0');
        }
        int res=Integer.parseInt(sb.toString(),2);
        return res;
    }
}
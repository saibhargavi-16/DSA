class Solution {
    public int maxDifference(String s) {
       int freq[]=new int[26];
       for(char ch:s.toCharArray()){
        freq[ch-'a']++;
       }
       int minEven=Integer.MAX_VALUE;
       int maxOdd=Integer.MIN_VALUE;
       for(int i=0;i<26;i++){
        if(freq[i]>0){
        if(freq[i]%2==0 ){
            if(freq[i]<minEven){
            minEven=freq[i];
            }
        }
        else{
            if(freq[i]>maxOdd) maxOdd=freq[i];
        }
        }
       }
       if(maxOdd==Integer.MIN_VALUE || minEven==Integer.MAX_VALUE) return 0;
       System.out.println(minEven+" "+maxOdd);
       return maxOdd-minEven;
    }
}
class Solution {
    public int reverseDegree(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        mp.put('a',26);mp.put('b',25);
        mp.put('c',24);mp.put('d',23); mp.put('e',22);
        mp.put('f',21); mp.put('g',20); mp.put('h',19);
        mp.put('i',18); mp.put('j',17); mp.put('k',16);
        mp.put('l',15); mp.put('m',14); mp.put('n',13);
        mp.put('o',12); mp.put('p',11); mp.put('q',10);
        mp.put('r',9); mp.put('s',8); mp.put('t',7);
        mp.put('u',6); mp.put('v',5); mp.put('w',4);
        mp.put('x',3);mp.put('y',2); mp.put('z',1);
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ans=mp.get(ch)*(i+1);
            c+=ans;
        }
        return c;
    }
}
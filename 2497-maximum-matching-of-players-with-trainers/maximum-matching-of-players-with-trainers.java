class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int m=players.length,n=trainers.length;
        int ans=0,i=0,j=0;
        while(i<m && j<n){
            if(players[i]<=trainers[j]){
                i++;
                j++;
                ans++;
            }
            else j++;
        }
        return ans;
    }
}
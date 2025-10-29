class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<matrix.length;i++){
            Set<Integer> row=new HashSet<>();
            Set<Integer> col=new HashSet<>();
            for(int j=0;j<matrix[0].length;j++){
                row.add(matrix[i][j]);
                col.add(matrix[j][i]);
            }
            if(row.size()!=n || col.size()!=n){
                return false;
            }
        }
        return true;
    }
}
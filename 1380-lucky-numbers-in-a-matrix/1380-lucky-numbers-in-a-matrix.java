class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
                int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0;i<n;i++){
            int rowMin = matrix[i][0];
            int col = 0;
            for(int j = 1;j<m;j++){
                if(matrix[i][j]<rowMin){
                    rowMin = matrix[i][j];
                    col = j;
                }
            }
            boolean lucky = true;
            for(int k = 0;k<n;k++){
                if(matrix[k][col] > rowMin){
                    lucky = false;
                    break;
                }
            }
            if(lucky){
                ans.add(rowMin);
            }


        }
        return ans;

        
    }
}
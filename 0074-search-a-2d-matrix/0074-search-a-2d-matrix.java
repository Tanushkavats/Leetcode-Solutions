class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int n = matrix.length;
      int m = matrix[0].length;
      int low = 0;
      int high = n*m-1;
      int mid = low+(high-low)/2;
      while(low<=high){
        int element = matrix[mid/m][mid%m];
        if(element ==target){
            return true;
        }
        if(element<target){
            low = mid+1;
        }else{
            high = mid-1;
        }
        mid = low+(high-low)/2;
      }  
      return false;
    }
}
class Solution {
    public int median(int[][] matrix) {
      int row = matrix.length;
      int col = matrix[0].length;

      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;

      for(int i = 0;i<row;i++){
        min = Math.min(min,matrix[i][0]);
        max = Math.max(max,matrix[i][col-1]);
      }

      int des = (row*col)/2;

      while(min<=max){
        int mid = (min+max)/2;
        int count = countSmallEqual(matrix,row,col,mid);
        if(count<=des)
           min =mid+1;
        else
           max = mid-1;
      }
      return min;
    }
    public int countSmallEqual(int [][] mat,int row,int col, int mid){
        int cnt = 0;
        for(int i = 0;i<row;i++){
            cnt+=countLessOrEqualmid(mat[i],mid,col);
        }
        return cnt;
    }
 public int countLessOrEqualmid(int [] row, int x,int n){
    int low = 0,high = n-1;
    int ans = n;
    while(low<=high){
       int mid = (low+high)/2;
       if(row[mid]>x){
           ans = mid ;
           high = mid-1;
       }  
        else 
          low = mid+1;
    }
    return ans;
 }
}

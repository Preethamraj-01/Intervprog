package Dsa;

public class Matrix2DArraySearch {

      int m=3,n=3;
    // private static int matrix[]=new int[][]{ [[1,3,5,7],[10,11,16,20],[23,30,34,60]]};
     private static    int [][] matrix={
                     {1, 2, 3},
         {4, 3, 6},
         {7, 8, 9}
         };


        public boolean searchMatrix(int[][] matrix, int target) {
          //linear search
            for(int i=0;i< matrix.length;i++)//row
                for(int j=0;j< matrix.length;j++)//column
                    if(matrix[i][j]==target)
                        return true;
            return false;
        }


        public static void main(String[] args) {
      Matrix2DArraySearch s=new Matrix2DArraySearch();
       boolean b= s.searchMatrix(matrix,1);
            System.out.println(b);
        }
}

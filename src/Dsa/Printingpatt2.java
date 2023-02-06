package Dsa;

public class Printingpatt2 {
    public static void main(String[] args) {
     //   int a=1,r=5,c=4,k=0,l=0;
//        int matrix[][]=new int[5][4];
////
//        for(int i=0;i< matrix.length;i++) {
//            for (int j = 0; j < 4; j++) {
//                matrix[i][j] = a;
//             //   System.out.print(matrix[i][j] + " ");
//                a++;
//            }
//          //  System.out.println();
//        }

        //To traverse elements in reverse spiral order
        int k=0;
        int l=3;
        int r=5,c=0;//chnage r,c,l,k value as per the traversing
        int matrix[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20}
        };

        while (k<r && l>c){//l is a pointer for column and k is for row
        for( int i=l;i>=c;i--){//Use c or r on what changes inside matrix
            System.out.print(matrix[k][i]+" ");
        }

        k++;


        for(int i=k;i<r;i++){
            System.out.print(matrix[i][c]+" ");
        }
        c++;
       if(k<r)//similar condition to while loop used above
        for( int i=c;i<=l;i++){
            System.out.print(matrix[r-1][i]+" ");
        }
        r--;

       if(l<c)//above 2 conditions is helpful when you consider only  2 elements
        for( int i=r-1;i>=k;i--){
            System.out.print(matrix[i][l]+" ");
        }
        l--;
    }
}
}


//            public static void spiralPrint(int[][] matrix, int r, int c){
//                int i;
//                int k = 0; // k -> r
//                int l = 0; // l -> c
//
//                while(k < r && l < c){
//                    // left to right --> column varies --> l -> c - 1, row remains constant
//                    for(i = l; i < c; i++){
//                        System.out.print(matrix[k][i] + " ");
//                    }
//                    k++;
//
//                    // top to bottom --> row varies --> k -> r - 1, column remains constant
//                    for(i = k; i < r; i++){
//                        System.out.print(matrix[i][c - 1] + " ");
//                    }
//                    c--;
//                    if(k < r){
//                        // right to left --> column varies --> c - 1 -> l, row remains constant
//                        for(i = c - 1; i >= l; i--){
//                            System.out.print(matrix[r - 1][i] + " ");
//                        }
//                        r--;
//                    }
//                    if(l < c){
//                        // bottom to top --> row varies --> r - 1 -> k, column remains constant
//                        for(i = r - 1; i >= k; i--){
//                            System.out.print(matrix[i][l] + " ");
//                        }
//                        l++;
//                    }
//                }
//            }
//
//            public static void main(String[] args) {
//                int[][] matrix = {
//                        {1, 2, 3, 4},
//                        {5, 6, 7, 8},
//                        {9, 10, 11, 12},
//                        {13, 14, 15, 16}
//                };
//                spiralPrint(matrix, matrix.length, matrix[0].length);
//            }
//        }

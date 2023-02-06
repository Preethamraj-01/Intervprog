package Dsa;

public class Printingpatteasy {
    public static void main(String[] args) {

        pattern5(5);
    }
//    public static void pattern1(int n){
//        for (int r = 1; r <= n; r++) {
//            if (r <= 5) {
//                for (int c = 1; c <= r; c++)//included c since column is changing
//                      System.out.print("*");
//                 //   System.out.print(c+" ");
//            }
//            else {
//               //se  the connection btwn row,column and n
//                for (int c = 1; c <= n - r; c++)
//                    //  for(int c=1;c<=r-2*k;c++)
//                    System.out.print("*");
//                 //  k=  k+1;
//            } //it does not work if we remove bracket
//            System.out.println();
//        }

        public static void pattern2(int n){

            for (int r = 1; r <= n; r++){

                int totalcolinrows = r<=5? r: n-r;

            for (int c = 1; c <=totalcolinrows; c++)
                System.out.print("* ");

                System.out.println();
        }

    }
     public static void pattern3(int n){
         for (int r = 1; r < 2*n; r++){

             int totalcolinrows= n>=r? r: 2*n-r;
             int spaces= n>=r?n-totalcolinrows:n-totalcolinrows;

             for(int c=1;c<=spaces;c++)
                 System.out.print(" ");

             for (int c = 1; c <=totalcolinrows; c++)
                 System.out.print("* ");
             System.out.println();
         }

     }

     public static void pattern4(int n){

        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                int orgnumber=4;
                int ateveryindex=orgnumber-Math.min(Math.min(r,c),Math.min(n-r-1,n-c-1));//taking up,down,left,right
                System.out.print(ateveryindex+" ");
            }
            System.out.println();
        }
     }

     public static void pattern5(int n){

//        for(int r=1;r<=n;r++){
//
//            for(int c=n;c>r;c--)
//                System.out.print(" ");
//
//            for (int c=1;c<2*n;c++){
//
//
//
//            }
//            System.out.println();
//        }

         for (int row = 1; row <= n; row++) {

             for (int space = 0; space < n-row; space++) {
                 System.out.print("  ");
             }

             for (int col = row; col >= 1; col--) {
                 System.out.print(col + " ");
             }
             for (int col = 2; col <= row; col++) {
                 System.out.print(col + " ");
             }

             System.out.println();
         }
     }
     }


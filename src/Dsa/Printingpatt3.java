package Dsa;

public class Printingpatt3 {

    public static void main(String[] args) {
        pattern3(5);
      //  pattern4(9);
    }
    public static void pattern3(int n) {

        for (int r = 1; r <= n; r++) {
            for (int c = n; c > r; c--)//for spaces
                System.out.print(" ");
            for (int c = 1; c <= r; c++)
                System.out.print("* ");

            System.out.println();
        }

    }
//    public static void pattern4(int n){
//
//            for(int r=1;r<=n;r++) {
//                if(r<=5) {
//                    for (int c = 1; c<=n-r-4; c++)
//                        System.out.print(" ");
//                    for (int c = 1; c <= r; c++)
//                        System.out.print("* ");
//                }
//                else
//                {
//                    for (int c = 1; c <= r-5;c++)
//                    System.out.print(" ");
//                for (int c = 1; c <= n-r+1; c++)
//                    System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//
//    }
    }


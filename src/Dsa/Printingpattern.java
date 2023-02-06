package Dsa;
import java.util.Scanner;

public class Printingpattern {
    public static void main(String[] args) {
        int k = 1;
//        for (int r = 0; r < 4; r++) {
//            for (int c = 0; c < r+2; c++) {
//                System.out.print(""+k+"\t");
//                  k++;
//            }
//            System.out.print("\n");
//        }
        System.out.println("Enter n=number of rows");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int r = 1; r <= n; r++) {
            if (r <= 5) {
                for (int c = 1; c <= r; c++)//included c since column is changing
                  //  System.out.print("*");
                System.out.print(c+" ");
        }
//            else {
//               //se  the connection btwn row,column and n
//                for (int c = 1; c <= n - r; c++)
//                    //  for(int c=1;c<=r-2*k;c++)
//                    System.out.print("*");
//                 //  k=  k+1;
//            } //it does not work if we remove bracket
            System.out.println();
        }
    }

}

package Dsa;

public class Recursion {
    public static void main(String[] args) {
      //  print(1);
        //to print 1 2 3 4 5

        //fibanocci series
        int ans =fibanocci(3);
        System.out.println(ans);

       // fibanocci1(6);
    }
    static void print(int n){
//      if(n<=5){
//        System.out.print(n+" ");
//        n++;
//        print(n);}


        //Another way is
        if(n>5){//without this condition it would result in stack overflow
            return;//when n=6 the control is returned to line 7 {to main()}
        }

        System.out.print(n+" ");
        //THIS IS CALLED "TAIL RECURSION"....
        print(n+1);
    }

    static int fibanocci(int n) {
        //BASE CONDITION
//        if (n == 0)
//            return 0;
//        if (n == 1)
//            return 1;

        if(n<2){
            return n;
        }
      //THIS IS NOT "TAIL RECURSION"....(bcos at the end it will return after adding ..)
        return fibanocci(n - 1) + fibanocci(n - 2);
    }
        static void fibanocci1(int n){

        if(n==0)
            System.out.print(n);
        if(n==1)
            System.out.print(n);

            System.out.println( fibanocci(n-2)+fibanocci(n-1));
    }
}

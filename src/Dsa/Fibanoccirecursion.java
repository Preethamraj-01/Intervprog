package Dsa;

public class Fibanoccirecursion {


//    public int fact (int n){
//
//        if(n>1)
//            return n*fact(n-1);
//        else return 1;
//    }

//    public int fib(int n){
//        if(n==0)
//            return 0;
//
//        if(n>1)
//            return fib(n-1)+fib(n-2);
//        else return 1;
//
//    }
    private static int n1=0,n2=1,n3=0,count=3;
    public void fibseries(int count){
        if(count>0) {
            n3 = n2 + n1;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            fibseries(--count);//Don't use post decrement
        }

    }
    public static void main(String[] args) {
        Fibanoccirecursion f=new Fibanoccirecursion();
      // int res= f.fact(5);
       // int res=f.fib(4);
        System.out.print(n1+" "+n2);
        f.fibseries(count-2);//1st 2 nos' already printed

      //  System.out.println(res);

    }

}

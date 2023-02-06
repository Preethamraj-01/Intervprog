package ObjectClone;

import java.util.Scanner;

public class Exception1 {

    static public void demo() {

        Scanner s=new Scanner(System.in);

        int n;
        n=s.nextInt();


try {
    System.out.println(10 / n);

    System.out.println("hello");
}

       catch (Exception e){

           System.out.println("caught exception");
       }

        //it will not be executed if we not use try-catch block
        System.out.println(n);


    }



    public static void main(String[] args) {



       // demo();

        System.out.println((int)'0');

    }
}

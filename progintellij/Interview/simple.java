package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class simple {
    public static void main(String[] args) {


        int n;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();

        int n1=1;
        int n2=1;
        int n3=0;


        for(int i=1;i<n-1;i++){

            n3=n2+n1;
            n1=n2;
            n2=n3;



        }

        System.out.println(n3);

    }
}

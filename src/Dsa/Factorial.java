package Dsa;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int N;
        Scanner s=new Scanner(System.in);
        N=s.nextInt();
        int fact=1;
        if(N>1){
            for(int i=2;i<=N;i++)
                fact=i*fact;
            System.out.println(N+"! = "+fact);
        }

        else System.out.println(fact);;
    }
}

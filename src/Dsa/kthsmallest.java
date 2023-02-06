package Dsa;
import java.util.Arrays;
import java.util.Scanner;

public class kthsmallest {
    public static void main(String[] args) {

        int a[]= new int[]{5, 6, 1, 10};

                Arrays.sort(a);
        System.out.println("Enter k");
                Scanner s=new Scanner(System.in);
                int k=s.nextInt();
        System.out.println(k+"th smallest element is " +a[k-1]);
    }

    }

package Dsa;
import  java.util.Scanner;
import java.util.Arrays;//for sorting
import java.lang.Math;//for using Math.pow


public class Array1 {


    int n;
   int arr[];

    void read(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no.of elements ");
        n=scan.nextInt();

        arr=new int[n];
        System.out.println("Enter thr array ele");
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();

    }
//    void reverse(){
//
//        for(int i=n-1;i>=0;i--)
//            System.out.print(arr[i]+"\t");
//
//    }
    void square(){
       int a[]=new int[n];
      //  double a[]=new double[n];//since Math.pow returns double
        int i=0;
        while (i<n){
           // a[i]=arr[i]*arr[i];
           a[i]= (int)Math.pow(arr[i],2);//it will return double


            i++;
        }
//        Arrays.sort(a);//method used to sort array in increasing order
//        for( i=0;i<a.length;i++)
//         System.out.print(a[i]+" ");
//        System.out.println("\n");
//
//        for( i=n-1;i>=0;i--)//for decreasing order
//            System.out.print(" "+a[i]);

        //To use a bubble sort
        //1.Increasing order
        //2.Decreasing order make a[i]<a[j]
        for(i=0;i<a.length-1;i++)//a.length == n
            for(int j=i+1;j<a.length;j++)
                if(a[i]<a[j]){
                   //swapping
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
        for( i=0;i<a.length;i++)
        System.out.print(a[i]+" ");

    }

    public static void main(String[] args) {

        Array1 a1=new Array1();
        a1.read();
      //  a1.reverse();
        a1.square();
        int k=25;
        System.out.println("\n"+Math.sqrt(25));

    }

}

package Dsa;

import java.util.Scanner;

public class LBAr4 {

    //TIME COMPLEXITY IS O(N)
    int arr[];
    int n;
    int c0=0,c1=0,c2=0;

    public LBAr4(){//CONSTRUCTOR for initializing array and using Scanner class
        Scanner s=new Scanner(System.in);
        System.out.println("n value");
        n=s.nextInt();
        arr=new int[n];
        System.out.println("elements are");
        for (int i=0;i<n;i++)
            arr[i]=s.nextInt();

    }


    public void count(){

        for (int i=0;i<n;i++){

            if(arr[i]==0)
                c0++;

            else if(arr[i]==1)
                c1++;

            else if(arr[i]==2)//can take else also
                c2++;
        }
    }
    public void display(){
        int i=0;
        while(c0>0) {
         arr[i++]=0;
            c0--;
        }

        while(c1>0) {
            arr[i++]=1;
            c1--;
        }
        for(int j=0;j<c2;j++) {
            arr[i++]=2;
            c2--;
        }
        System.out.println("final array");
        for (int k=0;k<n;k++)
            System.out.print(" "+arr[k]);

    }



    public static void main(String[] args) {

        LBAr4 l=new LBAr4();

        l.count();
        l.display();


    }

        //BUT TIME COMPLEXITY IS O(N^2)
//        int n = 5;
//        Scanner s=new Scanner(System.in);
//
//        int arr[] = new int[n];
//
//        for (int i = 0; i < n; i++)
//            arr[i]=s.nextInt();
//
//        // code here
//        for (int i = 0; i < n; i++)
//            for (int j = i + 1; j < n; j++) {
//
//                if (arr[i] > arr[j]) {
//
//                    // Math.(arr[i],arr[j]);
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        System.out.println("final array");
//        for (int i = 0; i < n; i++)
//        System.out.print("\t"+arr[i]);
//    }



}

package Dsa;
import java.util.*;

public class Stackprac {

    int top=-1;
    static int n;
    int[] arr =new int[n];


    public void push(int i){

        int max=n;

        if(top==max)
            System.out.println("Stack is full");
        else {


            arr[++top]=i;

        }}

        public void display(){

        for(int x:arr)
            System.out.println("elements are"+x);
        }


    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter n");
        n=s.nextInt();


        Stackprac obj=new Stackprac();
        System.out.println("enter element to be pushed");


        obj.push(s.nextInt());
        obj.display();


        }

    }



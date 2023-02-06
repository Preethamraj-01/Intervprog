package Dsa;
import java.util.*;

public class Queueoperatons {

    int arr[];
    int f=0;
    int r=-1;
    int size;

    public void insert(int i){

        if(r==size-1)
            System.out.println("Queue is full");

        else {

            arr[++r]=i;
        }
    }

    public void delete(){

        if(f-1==r)
            System.out.println("Queue is empty");

        else{
            System.out.println("deleted element is "+arr[f++]);
         //   f++;
        }
    }
     public void display(){

        for(int i=f;i<=r;i++)
            System.out.println(" "+arr[i]);

     }

    public static void main(String[] args) {

        Queueoperatons q=new Queueoperatons();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of Queue");
        q.size=s.nextInt();
        q.arr=new int[q.size];
        boolean done=true;

        while(done){
            System.out.println("1.Insert \n2.Delete \n3.Display \n4.exit");
            System.out.println("Enter your choice");
            int choice = s.nextInt();
            switch (choice){

                case 1:
                    System.out.println("Enter the element to insert");
                    q.insert(s.nextInt());
                    break;

                case 2:

                    q.delete();
                    break;

                case 3: q.display();
                break;

                case 4: done=false;
                break;

                default :
                    System.out.println("invalid choice");
            }
        }



    }
}

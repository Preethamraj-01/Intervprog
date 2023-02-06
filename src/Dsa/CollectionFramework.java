package Dsa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionFramework {
    public static void main(String[] args) {

      //  List<Integer> al=new ArrayList<>();//List is a INTERFACE which is implemented by ArrayList class
       LinkedList<Integer> al=new LinkedList<>();



        al.add(2);
        al.add(5);
        al.add(10);
        al.add(6);
        al.add(3);

        System.out.println(al);



//        for(int i=0;i<al.size();i++)
//            System.out.println("list at "+i+ " index is  "+al.get(i));
//
//        for(Integer x:al)
//         System.out.println("list using for each : "+x);

     //another way to iterate is using ITIRATOR..
     //ITERATOR Can be used to iterate any COLLECTIONS

     Iterator<Integer> it= al.iterator();

     while (it.hasNext())//to check nex element is present or not
      System.out.println("Using Iterator "+it.next());



        al.remove(4);
        System.out.println(al);


        al.remove(Integer.valueOf(5));
        System.out.println(al);

        System.out.println(al.isEmpty());//returns boolean

        System.out.println(al.size());

        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(6);
        al1.add(2);
        al1.add(420);

       // al.addAll(al1);//To append new list
        al.retainAll(al1);//To retain the elements present in al list
        System.out.println(al);

        al.set(1,1000);
        System.out.println(al);//set method to replace an older element

       al.add(2,999);
        System.out.println(al);

        al.addFirst(333);//NOTE:THESE TWO METHODS PRESENT ONLY IN LINKED LIST
        al.addLast(111);
        System.out.println(al);
        System.out.println(al.size());


    }
}

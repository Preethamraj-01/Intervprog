package Dsa;

import java.util.Iterator;
import java.util.Stack;

public class CollectionFrameworkStack {
    public static void main(String[] args) {


        Stack<String> s=new Stack<>();//LIFO data structure
        s.push("A");
        s.push("B");
        s.push("C");

        System.out.println(s);

        Iterator<String> it=s.iterator();

        while(it.hasNext())
            System.out.println("USing Iterator "+it.next());

        s.pop();//last in is c
        System.out.println(s);

        System.out.println(s.peek());//it will print the element where top is pointing
        System.out.println(s.empty());

       int pos= s.search("B");//it will get us position of element w.r.t top
        System.out.println(pos);
    }
}

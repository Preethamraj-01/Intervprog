package Dsa;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {

        Queue<Integer> q=new LinkedList<>();//INTERFACE->QUEUE and   CLASS IMPLEMENTING IT->LINKED LIST
     //  Queue<Integer> q=new PriorityQueue<>();//PRIORITY QUEUE IS SIMILAR TO QUEUE IN IMPLEMENTATION but

      //  Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());//COMPARATOR MAKES IT FOLLOW MAX HEAP (to print larger ele 1st)
        //THE DIFFERENCE IS " IT FOLLOWS MIN HEAP (prints smaller element 1st and remaining elements randomly)"
       // q.add(1);
        q.offer(100);
        q.offer(5);
        q.offer(4);
        q.offer(20);
        q.offer(11);
        System.out.println(q);
        System.out.println(q.element());//similar to q.peek();
       //FIFO DSA
       //q.remove();//throws exception if queue is empty
        System.out.println(q.poll());//1 will be removed first
        System.out.println(q);



    }
}

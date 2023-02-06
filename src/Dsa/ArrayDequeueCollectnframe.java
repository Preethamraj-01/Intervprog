package Dsa;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeueCollectnframe {
    public static void main(String[] args) {

       ArrayDeque<Integer> dq=new ArrayDeque<>();

        dq.offer(10);
        dq.add(20);
        dq.offer(23);

        System.out.println(dq);
                dq.offerFirst(12);
                dq.offerLast(45);
                dq.offer(26);
                dq.offer(10);//we can add duplicate elements in deque but can not add in set

                System.out.println(dq);

                System.out.println(dq.peek());
                System.out.println(dq.peekFirst());
                 System.out.println("using getFirst  "+dq.getFirst());//similar to peekFirst()
                System.out.println(dq.peekLast());

                System.out.println(dq.poll());//FIFO rule
                System.out.println("poll() " +dq);

                System.out.println(dq.pollFirst());
                System.out.println("pollFirst() " +dq);



                System.out.println(dq.pollLast());
                System.out.println("pollLast() " +dq);

            
       

    }
}

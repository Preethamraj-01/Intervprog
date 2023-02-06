package Dsa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetCollectnFrame {
    public static void main(String[] args) {

       // Set<Integer> s= new HashSet<>();

       // Set<Integer> s= new LinkedHashSet<>();//THE DIFF WHEN COMPARED TO HASHSET IS ,IN "LINKEDHASHSET " ELE ARE ARRANGED AS SIMILAR TO LINKEDLIST

        Set<Integer> s= new TreeSet<>();//ELE ARRANGED IN FORM OF SORTED LIST
        s.add(10);
        s.add(2);
        s.add(5);
        s.add(10);//CAN NOT ADD DUPLICATE ELEMENTS
        s.add(6);
        s.add(3);

        s.add(5);//CAN NOT ADD DUPLICATE ELEMENTS

        System.out.println(s);//Elements will be arranged randomly in HASHSET(learn hashing)
      s.remove(10);//we can remove element directly since we are not aware of index of elements
        System.out.println(s);

        System.out.println(s.isEmpty());
        System.out.println(s.size());
        System.out.println(s.contains(6));
        s.clear();
        System.out.println(s);

    }
}

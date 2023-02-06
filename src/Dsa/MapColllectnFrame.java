package Dsa;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapColllectnFrame {
    public static void main(String[] args) {

      //  Map<String,Integer> m=new HashMap<>();//order of elements will be random
      //  Map<String,Integer> m=new TreeMap<>();//order based on key(here follows Alphabetical order)
        Map<String,Integer> m=new LinkedHashMap<>();//order is based on the input we give
        m.put("one",1);
        m.put("two",2);
        m.put("three",3);
        m.put("four",4);

        System.out.println(m);

        m.remove("four");
        System.out.println(m);

        m.put("two",20);//this will override the 1st one(two,2)
        System.out.println(m);

        m.putIfAbsent("three",30);//it will be added only if key(three) is present
        if(!m.containsKey("three")){
            m.put("three",33);//it will be added only if key(three) is present
        }
        System.out.println(m);

        //Another way to iterate MAP is
        for (Map.Entry<String,Integer> e:m.entrySet()){
            System.out.println(e);

            //to print key and value separately
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //or

        for(String s:m.keySet()){
            System.out.print("using keyset "+s+" , ");
        }
        System.out.println();
        for(Integer i:m.values()){
            System.out.print(" using values "+i+" , ");
        }
        System.out.println();
        System.out.println(m.containsValue(20));

    }
}

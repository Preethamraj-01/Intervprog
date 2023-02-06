package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class StringOcc {
    public static void main(String[] args) {

        String[] arr={"mon","tue","mon","wed","thu"};

       Map<String,Integer> map=new HashMap<>();
       int count=0;
       for(String k:arr){
           if (map.containsKey(k)) {
               map.put(k, map.get(k) + 1);
           }
           else{
               map.put(k,1);
           }
       }



      // Set<Map.Entry<String,Integer>> set=map.entrySet();
       for(Map.Entry<String,Integer> me: map.entrySet()){
           System.out.println(me.getKey()+" : "+me.getValue());
       }

        //System.out.println(count);
    }
}

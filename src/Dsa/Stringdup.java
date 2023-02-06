package Dsa;

import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public class Stringdup {
    //  public static void main(String[] args) {

//        String s="great responsibility";
//
//       // char c[]=s.toCharArray();
//
//        Set<Character> i =new LinkedHashSet<>();
//        Set<Character> dup =new LinkedHashSet<>();
//
//
//        for(int k=0;k<s.length();k++){
//
//            if(i.contains(s.charAt(k))){
//               dup.add(s.charAt(k));
//            }
//
//
//           i.add(s.charAt(k));
//
//        }
//        System.out.print(dup+" ");
//      //  System.out.println(i);
//    }
//}
//        String str = "w3schools";
//        int cnt = 0;
//        char[] inp = str.toCharArray();
//        System.out.println("Duplicate Characters are:");
//        for (int i = 0; i < str.length(); i++) {
//            cnt = 0;
//            for (int j = 0; j < str.length(); j++) {
//                if (inp[i] == inp[j]) {
//                    //  System.out.println(inp[i]);
//                    cnt++;
//                    //  break;
//                }
//            }
//            if (cnt == 1)
//                System.out.print(inp[i]);
//        }
//
//
//        String s = "hello";
//        System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));


    //}
//}
    static final int NO_OF_CHARS = 256;

    /* Fills count array with
       frequency of characters */
    static void fillCharCounts(String str,int[] count) {
       // System.out.println(count[str.charAt(1)]);
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
    }

    /* Print duplicates present
      in the passed string */
    static void printDups(String str) {
        // Create an array of size
        // 256 and fill count of
        // every character in it
        int count[] = new int[NO_OF_CHARS];
        fillCharCounts(str, count);

        for (int i = 0; i < NO_OF_CHARS; i++)
            if (count[i] > 1)
                System.out.println((char) (i) + ", count = " + count[i]);
    }

    public static void main(String[] args) {
        String str = "hello hey";
        printDups(str);
    }
}
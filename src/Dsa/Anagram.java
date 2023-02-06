package Dsa;


    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

    public class Anagram {

        int a=1;
        int b=5;

        static boolean isAnagram(String a, String b) {
            // Complete the function


            a=a.toUpperCase();
            b=b.toUpperCase();
            char c[]=a.toCharArray();
            char d[]=b.toCharArray();

            Arrays.sort(c);
            Arrays.sort(d);
          //  int j=0;

//              for(int i=0;i<a.length();i++){
//
//                  if(c[i]!=d[j]){
//                     return false;
//                     }
//                       j++;
//              }
//
//
//             return true;
            System.out.println(c);
            System.out.println(d);

            System.out.println(Arrays.equals( c, d));
             return Arrays.equals( c, d);

        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("enter a");
            String a = scan.next();
            System.out.println("enter b");
            String b = scan.next();
            scan.close();
            System.out.println( a.compareTo(b));
            boolean ret = isAnagram(a, b);



            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }


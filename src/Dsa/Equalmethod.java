package Dsa;

public class Equalmethod {

        public static void main(String[] args) {
            String a="abb";
            String c=new String("abb");
            String b="abb";
            String d="bbb";
            String e="A";
            int f=10;
            int g=5;

            System.out.println(a.equals(b));
            System.out.println(a==c);
            System.out.println(a==b);
            System.out.println(a.compareTo(c));
            System.out.println(a.compareTo(b));
            System.out.println(a.compareTo(d));
            System.out.println(d.compareTo(a));
            System.out.println(a.compareTo(e));//Ascii value of a>A(32 times greater)
            // System.out.println(f.compareTo(g));//works only for object

        }
    }


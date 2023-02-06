package Dsa;

public class String1kunal {
    public static void main(String[] args) {


        for (int i = 0; i < 26; i++)
            //   System.out.println('a'+i);//prints Ascii value
            System.out.println((char) ('a' + i));


        String series = "";

        for (int i = 0; i < 26; i++) {
           char ans = (char) ('a' + i);//nEW OBJECT WILL BE CREATED all the time.O(n^2)
            System.out.print(series+ans);//String concatenation

        }
    }
}
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class test {

    public static int checkpassword(String input)
    {
        // Checking lower alphabet in string
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = true;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = false;
        }

        // Strength of password
        //System.out.print("Strength of password:- ");


          if (hasDigit && hasLower && hasUpper && (n >= 6) && specialChar ){
              return 1;
          }


        else
            return 0;
    }



    static public void closestnumber(List<Integer> numbers){


        int arr[]= new int[numbers.size()];
        int n=numbers.size();

        for(int i=0;i<numbers.size();i++)
            arr[i]=numbers.get(i);

        if (n <= 1)
            return;


        Arrays.sort(arr);


        int minDiff = arr[1] - arr[0];
        for (int i = 2; i < n; i++){

           int diff = arr[i] - arr[i-1];

           if(diff<minDiff)
               minDiff=diff;

        }
           // minDiff = Math.min(minDiff, arr[i] - arr[i-1]);


        for ( int i = 1; i < n; i++)
        {
            if ((arr[i] - arr[i-1]) == minDiff)
            {
                System.out.println( arr[i-1]+" "+ arr[i] );
            }
        }




    }


    public static void main(String[] args) {


//        String input = "]}*whdha  {[[";
//        char[] a = new char[100];
//        char[] b = new char[100];
//        char[] c = new char[100];
//        int j = 0, k = 0, l = 0;
//        for(int i = 0; i < input.length(); i++)
//        {
//            char x = input.charAt(i);
//            if(x == '[' || x == '{')
//                a[j++] = x;
//            else if(x == ']' || x == '}')
//                b[k++] = x;
//
//            else
//                c[l++] = x;
//        }
//        Arrays.sort(c);
//        String a1 = String.valueOf(a).trim();
//        String b1 = String.valueOf(b).trim();
//        String c1 = String.valueOf(c).trim();
//        System.out.println(a1+c1+b1);


       // System.out.println(checkpassword("Hello$123"));

        List<Integer> l = new ArrayList<>();
        l.add(4);
        l.add(-2);
        l.add(-1);
l.add(3);
        closestnumber(l);


    }
}

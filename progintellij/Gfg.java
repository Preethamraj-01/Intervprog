// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Gfg{



    static String permute(int i, String s,String ans)
    {

        // Base case
        if (i == (s.length() - 1))
        {
           // System.out.print(s + "\n");
            ans = ans + s + " ";
           // System.out.print(ans + "\n");

            return "";
        }

        char prev = '*';

        // Loop from j = 1 to length of String
        for(int j = i; j < s.length(); j++)
        {
            char []temp = s.toCharArray();
            if (j > i && temp[i] == temp[j])
                continue;
            if (prev != '*' && prev == s.charAt(j))
            {
                continue;
            }

            // Swap the elements
            temp = swap(temp,i,j);
            prev = s.charAt(j);

            // Recursion call
            permute(i + 1, String.valueOf(temp),ans+s);
        }
        return ans;
    }

    static char[] swap(char []arr, int i, int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    static String sortString(String inputString)
    {

        // Convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // Sort tempArray
        Arrays.sort(tempArray);

        // Return new sorted string
        return new String(tempArray);
    }


    public static String solve(String s){

        s = sortString(s);




        return permute(0, s,"");

    }



    // Driver code
    public static void main(String[] args)
    {
        String s = "abc";

        System.out.println(solve(s));

    }
}
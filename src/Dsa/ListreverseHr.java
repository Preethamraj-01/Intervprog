package Dsa;


    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    class Result {

        /*
         * Complete the 'reverseArray' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY a as parameter.
         */

        public static List<Integer> reverseArray(List<Integer> a) {


            //  Collections.reverse(a);
            //  return a;

            int s=0;
            int e=a.size();
            System.out.println(e);
//
            while(s<e){

//                int temp=a.get(s);
//                a.get(s)=a.get(e);
//                a.get(e)=temp;
              Collections.swap(a,s,e);


                s++;
                e--;

            }

            return a;

        }

    }

    public class ListreverseHr{
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < arrCount; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }

            List<Integer> res = Result.reverseArray(arr);

            for (int i = 0; i < res.size(); i++) {
                bufferedWriter.write(String.valueOf(res.get(i)));

                if (i != res.size() - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }



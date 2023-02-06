
import java.util.*;
public class Boeing {

    static String boe(String n){

        float a = Float.parseFloat(n);

        System.out.println(a);

        float b = (float) Math.round(a);
        System.out.println(b);

        if(a==b)
            return "YES";

        return "NO";

    }


    static void Icecream(int radius,int height){

        while(0==0)
        {
            System.out.println("gvgvv");
        }


      //  return radius*radius*((2*radius)+height);


    }

    static int findsum(int arr[],int target){

        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

                sum=arr[i]+arr[j];
                if(sum==target)
                    return i+j;
                sum=0;

            }
        }


 return 0;

    }


    public static void main(String[] args) {

        String n = "34.34";

        System.out.println(boe(n));

        Icecream(4,9);
        int arr[] ={2,10,8,12,6,7};
        int tar=16;

        System.out.println(findsum(arr,tar));


    }
}


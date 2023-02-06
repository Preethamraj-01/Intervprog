package Dsa;
import java.util.Arrays;

public class Binarysearchrecur {
    public static void main(String[] args) {
        int arr[]=new int[]{4,10,6,5,3};
        Arrays.sort(arr);
        int res=bs(arr,10,0,arr.length-1);
        System.out.println("target is at position arr["+res+"]");

    }

    public static int bs(int arr[],int target,int s,int e){

        if(s>e){
            return -1;
        }

        int m=(s+e)/2;

        if(arr[m]==target)
            return m;


        if(target>arr[m]){
          //  s=m+1;
           return bs(arr,target,m+1,e);
        }



            return bs(arr,target,s,m-1);



    }

}

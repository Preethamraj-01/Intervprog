package Dsa;

public class Maxsubarraysum {

    //sub array=A small part of array and it's continuous


    private static int a[]=new int[]{4,-5,-6,2,0,10};
    public long Maxsubarray(int arr[]){


            // code here
            long maxTH=arr[0],minTH=arr[0],maxsofar=arr[0];
            for(int i=1;i<arr.length;i++){

                long  temp=maxTH;//maxTH get updated before using it in minTH ..so
                maxTH=Math.max(arr[i],Math.max(arr[i]*maxTH , arr[i]*minTH));//maxTH==current in kadane's algo
                minTH=Math.min(arr[i],Math.min(arr[i]*temp , arr[i]*minTH));//minTH is for negative big number

                maxsofar=Math.max(maxsofar,maxTH);
            }



            return maxsofar;


        }



    public static void main(String[] args) {

        Maxsubarraysum m =new Maxsubarraysum();

       long res= m.Maxsubarray(a);
        System.out.println(res);
    }
}

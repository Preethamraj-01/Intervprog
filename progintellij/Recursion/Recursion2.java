package Recursion;

import java.util.ArrayList;

public class Recursion2 {

    static int longestsubsequence(int arr[],int index,int prev) {


        if(index==arr.length)
            return 0;

        int len1=0;
        //pick
        if(prev==-1 || arr[index]>arr[prev])
            //            len = Math.max(len , 1+longestsubsequence(arr,index+1,index));
            len1=1+longestsubsequence(arr,index+1,index);


        //not pick

        int len2=0+longestsubsequence(arr,index+1,prev);


        return Math.max(len1,len2);

    }

    static ArrayList<Integer> l = new ArrayList<>();
    static void subarray(int a[] ,int i,int n){


        if(i==n) {
            return;
        }

        for ( int j=i;j<n;j++)
        {

            l.add(a[j]);
            System.out.println(l);
            if(j==n-1)
                l.clear();
        }


        subarray(a,i+1,n);

    }
    static int sum=0,count=0;

    static void sumsubarray(int a[],int i,int n,int k){


        if(i==n) {
            return;
        }

        for ( int j=i;j<n;j++)
        {


            l.add(a[j]);
            sum+=a[j];
            if(sum==k)
            System.out.println(l);
            if(j==n-1) {
                l.clear();
               sum=0;
            }
        }


        sumsubarray(a,i+1,n,k);



    }

    static ArrayList<Integer> al = new ArrayList<>();


    static ArrayList<ArrayList<Integer>> ll = new ArrayList<>();
    static ArrayList<ArrayList<Integer>> subarrlist(int a[] ,int i,int n){


        if(i==n) {
            return ll;
        }

        for ( int j=i;j<n;j++)
        {

            al.add(a[j]);
            ll.add(new ArrayList<>(al));


            // ll.add(al);  //doesn't work

           // System.out.println(ll);
            if(j==n-1)
                al.clear();
        }


        subarrlist(a,i+1,n);

        return ll;

    }

    static int sumsubarraycount(int a[],int i,int n,int k){

        if(i==n) {
            return count;
        }

        for ( int j=i;j<n;j++)
        {

            sum+=a[j];
            if(sum==k)
                count++;
            if(j==n-1) {
                sum=0;
            }
        }


        sumsubarraycount(a,i+1,n,k);

        return count;


    }

    static int sumsubarraycount2(int a[],int i,int n,int k){

        if(i==n) {
            return count;
        }

        for ( int j=i;j<n;j++)
        {

            k-=a[j];
            if(k==0)
                count++;
            if(j==n-1) {

            }
        }


        sumsubarraycount2(a,i+1,n,k);

        return count;


    }





    public static void main(String[] args) {

        //1.LONGEST increasing  SUBSEQUENCE

        int arr[]={10,9,2,5,3,7,101,18};
        System.out.println(longestsubsequence(arr,0,-1));



        //2.ALL SUB ARRAY

        int a[] = {1,2,3};
       // subarray(a,0,a.length);


        //3.ALL SUB ARRAY EQUAL TO K
        //sumsubarray(a,0,a.length,3);

        //DOUBT

        //4.All subarray inside  a list


       // System.out.println(subarrlist(a,0,a.length));


        //5.count of subarray equals k

      // System.out.println(sumsubarraycount(a,0,a.length,3));

        //6.without extra variable
        //System.out.println(sumsubarraycount2(a,0,a.length,3));






    }
}


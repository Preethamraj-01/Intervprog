package Tree;

import java.util.Arrays;

public class MergeSort {


    static void merge(int arr[],int l,int mid,int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int la[] = new int[n1];
        int ra[] = new int[n1];


        //copy elements
        for (int i = 0; i < n1; i++)
            la[i] = arr[l + i];
        for (int i = 0; i < n2; i++)
            ra[i] = arr[mid + 1 + i];

        //merge sort


        //important
        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {

            if (la[i] < ra[j]) {

                arr[k++] = la[i++];

            } else
                arr[k++] = ra[j++];

        }


        while(i<n1)
            arr[k++] = la[i++];

        while (j<n2)
            arr[k++] = ra[j++];

    }

    static int[] mergesort(int arr[],int l,int r){


        //important
        if(l<r){

           int  mid = (l+r)/2;

           mergesort(arr,l,mid);
           mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);


        }



   return arr;

    }



    public static void main(String[] args) {


        int a[] = {3,1,4,6,5};

        int l = 0;
        int r = a.length-1;


        System.out.println(Arrays.toString( mergesort(a,l,r)));


    }
}

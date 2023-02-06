package Dsa;
import java.util.*;

public class ArrzeroMoveend {
    public static void main(String[] args) {

//        int n;
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enetr n elements");
//        n = s.nextInt();
//
//        int arr[];
//        arr = new int[n];
//        System.out.println("enter array elements");
//        //  n= arr.length;
//        for (int i = 0; i < n; i++)
//            arr[i] = s.nextInt();

//        int j=0;
//        for(int i=0;i<n;i++) {
//
//            if (arr[i] != 0 && arr[j]==0) {
//                int temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//            }
//         if(arr[j]!=0)
//             j++;
//
//
//        }
//
//        for(int i=0;i<n;i++){
//            int temp=arr[i];
//            arr[i]=arr[n-1];
//            arr[n-1]=temp;
//            n--;
//        }

        String s = "121";
        char arr[] = s.toCharArray();
        int n=arr.length;
        int count = 0,j=n;
        for (int i = 0; i < (n/2); i++) {

            if (arr[i] == arr[j- 1]) {
                count++;
            }
             j--;
        }

        n = arr.length;
        if (count == (n / 2))
            System.out.println("Given element is a PALINDROME");
        else System.out.println("Given element is not a palindrome");
    }

//        n= arr.length;
//
//            for(int i=0;i< n;i++)
//                System.out.println("new array is "+arr[i]);
//        }

}


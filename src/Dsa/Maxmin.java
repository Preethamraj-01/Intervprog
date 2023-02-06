package Dsa;
import java.util.Scanner;

public class Maxmin {

    int max, n;
    int a[];
    int target = 9;

    public void read() {
        System.out.println("enter n");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        System.out.println("enter array");
        a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scan.nextInt();


    }

        public void largest(){

       max=a[0];
       
      // int temp=0;
            int c=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>max){//make a[i]<max to get minimum element in the array
                max=a[i];
               // temp=i;
                c++;
              }
        }
       // System.out.println("largest element is "+max+ "and its index is "+temp);
    }
//    public void unique() {
//        int count = 0, i, k = 0;
//       int u[] = new int[n];
//
//
//
//      outer:  for (i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (a[i] == a[j]) {
//                    count++;
//                }
//
//            }
//            if (count == 1) {
////                u[k] = a[i];//this is for another method
////                k++;
//               //use this
//                 System.out.println(a[i]);
//               break outer;//remove this line if you wanna print all unique numbers
//            }
//            count = 0;//IMPORTANT
//        }
//
//    }
    //Another way to print  a unique number
//       for(int l=0;l<u.length;l++)
//      //   for (int l:u)
//              {
//                  if(u[l]!=0)
//                 System.out.println("unique number is" + u[l]);
//             }

//    public void twosum() {
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//
//                if (a[i] + a[j] == target)
//                    System.out.println("index are a[" + i + "] and a[" + j + "]");
//            }
//
//        }

            public void firstuniquechar() {
                int count = 0;
                String s = "aafbb";
                char c[] = s.toCharArray();
                char n[]=new char[1];//this array is for else condition
            outer:    for (int i = 0; i < c.length; i++) {
                    for (int j = 0; j < c.length; j++) {
                        if (c[i] == c[j])
                            count++;
                    }
                    if (count == 1) {
                        n[0]=c[i];
                        System.out.println(n[0]);
                       break outer;//remove this line if you wanna print all unique characters
                    }

                    count = 0;
                }
                       if(n[0]==0)
                      System.out.println("NO REPEATING CHARACTER");
            }


        public static void main(String[] args){
        Maxmin m=new Maxmin();
       // m.read();
        m.largest();
       // m.unique();
         // m.twosum();

        //   m.firstuniquechar();
    }
}

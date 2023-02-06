import java.util.*;

public class Rakhi {


    public static int[] occur(String s){

        int[] ans = new int[26];


        for(int i=0;i<s.length();i++){

            ans[s.charAt(i)-'a']++;



        }

  return ans;



    }

    public static void occumap(String s){

        HashMap<Character,Integer> m = new HashMap<>();


        for(int i=0;i<s.length();i++){

            if(m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),m.get(s.charAt(i))+1);
            }

            else
            m.put(s.charAt(i),1);


        }


        System.out.println(m);


    }


    public static void main(String[] args) {

//        Scanner sc= new Scanner(System.in);
//
//        int n=sc.nextInt();
//
//        //int m=sc.nextInt();
//
//
//
//        int a[] = new int[n];
//
//        for(int i=0;i<n;i++){
//
//            a[i]=sc.nextInt();
//        }
//
//
//
//
//
//
//
//        long ans=0;
//
//        for(int i=0;i<n;i++)
//            for(int j=0;j<n;j++)
//                ans+=a[i]*a[j];
//
//        System.out.println(ans);




//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the number of Test Cases");
//        int t = s.nextInt();
//        for(int i=0;i<t;i++)
//        {
//            System.out.println("Enter the number n");
//            int n = s.nextInt();
//            int[] arr=new int[n+1];
//            for(i=1;i<=n;i++){
//                arr[i]=s.nextInt();
//            }
//            int count=0;
//            int[] arr1=new int[n+1];
//            arr1 = Arrays.copyOf(arr, arr.length);
//            boolean check;
//            do {
//                for (i = 1; i <= n; i++) {
//                    arr1[i] = arr[arr[i]];
//                }
//                arr = Arrays.copyOf(arr1, arr1.length);
//                count++;
//                int [] temp = Arrays.copyOf(arr1, arr1.length);
//                Arrays.sort(arr1);
//                check = false;
//                for(int m =1;m<=n;m++){
//                    if(arr1[m]==temp[m])
//                        check = true;
//                    else{
//                        check = false;
//                        break;
//                    }
//                }
//            }
//            while(count<fact(n) && check!=true);
//
//            if(count == fact(n))
//                System.out.println("-1");
//            else
//                System.out.println(count);
//        }
//    }
//    public static int fact(int n){
//        int temp = 1;
//        for(int i=1;i<=n;i++)
//            temp*=i;
//        return temp;
//    }


         /*   int s[]={10,-46,30,-111,5,3};

              int k=0;

            for(int i=0;i<s.length;i++)
            {
                System.out.print(s[i]+" ");
            }

            int max=Integer.MIN_VALUE;
            for(int i=0;i<s.length;i++)
            {

                if(s[i]<0)
                 k = -s[i];

                else
                    k= s[i];

                System.out.println(k);
                if(k%2!=0)
                if(k>max)
                {
                    max=k;
                }

            }

        System.out.println("ans is "+max);


            int j;
                for(int i=1;i<=10;i++){

                    for(j=2;j<=i;j++) {

                        if (i % j == 0) {
                            break;
                        }
                    }
                        if(i==j){
                            System.out.println(i);
                        }

                }


*/

        String s = "preetham";

       // System.out.println(Arrays.toString(occur(s)));

        int [] ans=occur(s);


        for (int i=0;i<26;i++){

            if(ans[i]>0)
            System.out.println( (char)('a'+i)+"  ->  "+ans[i]);


        }

        occumap(s);

        }

}



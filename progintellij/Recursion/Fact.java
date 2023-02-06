package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Fact {

    static  int fact(int n){

        if(n==0||n==1)
            return 1;

      return n*fact(n-1);

    }

    static int fib(int n){

        if(n==0||n==1)
            return  n;


        return fib(n-1)+fib(n-2);

    }


    static void print(int n){

        if(n==0)return;


        print(n-1);

        System.out.println(n+" ");


    }

    //FUNCTIONAL RECURSION
    static int sum(int n){

        if(n==0)
            return 0;

        return n+sum(n-1);

    }

 //PARAMETERIZED RECURSION
    static int sumpar(int n,int ans){

        if(n==0)
            return ans;

        //ans+=n;

        return sumpar(n-1,ans+n);

    }


    static int sumofdigits(int n){

        if(n==0)
            return 0;

          int k=n%10;

        return k+sumofdigits(n/10);
    }


static int c=0;
    static int freq(int n){


        if(n==0)
            return c;

        int k=n%10;

        if(k==2)
            c++;

        return freq(n/10);

    }


    static int freqpar(int n,int c){

        if(n==0)
            return c;


        if(n%10==0)
        return freqpar(n/10,c+1);

        return freqpar(n/10,c);

    }



    static int sumofnaturalnos(int n,int sum){

        if(n==0)return 0;


       // sum+=n;
        //return sumofnaturalnos(n-1,sum);


        return n+sumofnaturalnos(n-1,sum);



       // return sum;

    }

    static  int ans=0;
    static int reverse(int n){

        if(n==0)
            return ans;

        int k=n%10;



        ans=(ans*10+k);

        return reverse(n/10);

    }

    static int reversepar(int n,int ans){


            if(n==0)
                return ans;

            int k=n%10;

            return reversepar(n/10,(ans*10+k));

    }

    static boolean palindrome(int n){


        int ans=reverse(n);

     return ans==n?true:false;

    }

    static boolean palstr(String str,int s,int e){


        if(s>=e)
            return true;


        if(str.charAt(s)!=str.charAt(e))
        return false;

        return palstr(str,s+1,e-1);

    }


    static boolean linearsearch(int a[],int x,int index){

        if(index==a.length)
            return false;

        if(a[index]==x)
            return true;

        return linearsearch(a,x,index+1);


    }

    static int lsindex(int a[],int x,int index){

        if(index==a.length)
            return -1;

        if(a[index]==x)
            return index;

        return lsindex(a,x,index+1);

    }

    static int binarysearch(int a[],int x,int s,int e,int mid){

        //NOTE DIFFERENCE
        if(s>e)
            return -1;

        if(a[mid]==x)
            return mid;

        else if (x>a[mid]) {
           s=mid+1;
           mid=(s+e)/2;
            return binarysearch(a,x,s,e,mid);
        }

        else {
            e=mid-1;
            mid=(s+e)/2;
            return binarysearch(a,x,s,e,mid);
        }

    }

    //without mid as parameter


    static int bs(int a[],int x,int s,int e){


        if(s<=e){

            int mid = (s+e)/2;

            if(a[mid]==x)
                return mid;

            else if(x>a[mid])
            {
      //WITHOUT RETURN STATEMENT IT WILL RETURN -1;
               return bs(a,x,mid+1,e);
            }

            else{

               return bs(a,x,s,mid-1);
            }


        }

        return -1;

    }

    static String ans1="";
    static String helper(String s,int i){

        if(s.length()==i)
            return ans1;


        if(s.charAt(i)!='a')
        {
            ans1+=s.charAt(i);
            return helper(s,i+1);
        }

            return helper(s,i+1);


    }

    //when provided only a string as parameter
    static String removea(String s){

       return helper(s,0);
    }

    static String helper1(String s,String remove,int i,String ans){

        int len = remove.length();

        if(s.length()==i)
            return ans;




        if(i<s.length()-len && s.substring(i,i+len).equals(remove))
        {
            return helper1(s,remove,i+len,ans);

        }

        else {

            ans+=s.charAt(i);
            return helper1(s,remove,i+1,ans);

        }


    }

    static String removegeeks(String s,String remove){

        return helper1(s,remove,0,"");
    }


    static String removegeeks1(String s,String remove){


        if(s.isEmpty())
            return  "";

        char c = s.charAt(0);

        if(s.startsWith(remove))
            return removegeeks1(s.substring(remove.length()),remove);

        return c+removegeeks1(s.substring(1),remove);

    }

    //PRINT ALL subsequenceS


     static void subsequence(String s,String ans){

        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }


        char c = s.charAt(0);

        //pick
         subsequence(s.substring(1),ans+c);
        //not pick
         subsequence(s.substring(1),ans);

    }


    //subsequence FOR int a[]

    static int max=Integer.MIN_VALUE;

    static void subsequencearray(int a[],ArrayList<Integer> ans,int index) {


        if (index > a.length-1){
            System.out.println(ans);
        return;
    }

        //pick


        ans.add(a[index]);
        subsequencearray(a,ans,index+1);

        //not pick
        ans.remove(ans.size()-1);
        subsequencearray(a,ans,index+1);


    }





    static void subsequencearraychar( String s,ArrayList<Character> ans,int index) {


        if (index > s.length()-1){
            System.out.println(ans);
            return;
        }

        //pick
        ans.add(s.charAt(index));
        subsequencearraychar(s,ans,index+1);

        //not pick
        ans.remove(ans.size()-1);
        subsequencearraychar(s,ans,index+1);


    }




    //USING ARRAYLIST
    static ArrayList<String> l = new ArrayList<>();
    static ArrayList<String> subsequencelist(String s, String ans){

        if(s.isEmpty() ){

            if(ans!="")
            l.add(ans);

            return l;
        }


        char c = s.charAt(0);

        //pick
         subsequencelist(s.substring(1),ans+c);
        //not pick
        subsequencelist(s.substring(1),ans);

        return l;
    }


    static ArrayList<String> subsequencein(String s,String ans){

        if(s.isEmpty()){
            ArrayList<String> l = new ArrayList<>();

            l.add(ans);

            return l;
        }

        char ch = s.charAt(0);



        //pick
        ArrayList<String> left = subsequencein(s.substring(1),ans+ch);

        //Not pick
        ArrayList<String> right = subsequencein(s.substring(1),ans);


        left.addAll(right);

        return left;

    }

    //WRONG
    static LinkedHashSet<String> perm(String s, String ans){

        if(s.isEmpty()){
            LinkedHashSet<String> l = new LinkedHashSet<>();

            l.add(ans);

            return l;
        }

        char ch = s.charAt(0);


        LinkedHashSet<String> left = perm(s.substring(1),ans+ch);


        LinkedHashSet<String> right = perm(s.substring(1),ch+ans);


        left.addAll(right);

        return left;

    }


    //correct
    static void permuatations(String ans,String s){

        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = s.charAt(0);

        for(int i=0;i<=ans.length();i++)
        {
            String f = ans.substring(0,i);
            String sec = ans.substring(i,ans.length());
            permuatations(f+ch+sec,s.substring(1));

        }


    }

    static String helper2(String s,String ans,int index){

        if(s.length()-1<index){

            return ans;
        }

        char ch = s.charAt(index);

        if( index<s.length()-1 && s.charAt(index)==s.charAt(index+1)){
            return helper2(s,ans,index+2);
        }

        return helper2(s,ans+ch,index+1);

    }

    static String removeadjduplicates(String s,String ans)
    {

       return helper2(s,ans,0);

    }


    static String removeadjiter(String s){

        int flag=1;
        String ans="";

        for(int i=0;i<s.length();i++){



            while (i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
            {
                i++;

                flag=0;
            }

            if(flag==0){
                i++;
                flag=1;
            }

            ans+=s.charAt(i);



        }

        return ans;

    }


    static int sum=0;
    static int sumofn(int n){

        if(n==0)return 0;


        sum+=n;

        sumofn(n-1);

        //sum-=n;

        return sum;


    }


    public static void main(String[] args) {


//        System.out.println(fact(5));

//        for(int i=0;i<6;i++)
//        System.out.println(fib(i));


       // print(5);

       // System.out.println(sum(5));

        //Parameterized sum of N natural no's

        //System.out.println(sumpar(5,0));


       // System.out.println(sumofdigits(1234));

        //System.out.println(freq(2232));

        //or

       // System.out.println(freqpar(10203,0));


       // System.out.println(sumofnaturalnos(10,0));


      // System.out.println(reverse(1234));

       // System.out.println(reversepar(1234,0));


      //  System.out.println(palindrome(12321));

       // String s="madamm";

        //System.out.println(palstr(s,0,s.length()-1));


       // int a[]={2,5,6,8,9};
       //System.out.println(linearsearch(a,9,0));

      //  System.out.println(lsindex(a,9,0));

        //SEND A SORTED ARRAY

       //  int mid=a.length/2;
      // System.out.println(binarysearch(a,9,0,a.length-1,mid));

      // System.out.println(bs(a,9,0,a.length-1));


       // String s1="abcaadaad";
       // System.out.println(removea(s1));



//        String s2 = "abcdgeeksde";
//        String remove="geeks";
       // System.out.println(removegeeks(s2,remove));


        //kunal's method for removing a substring "geeks"


      //  System.out.println(removegeeks1(s2,remove));

//        String s = "abc";
//         subsequence(s,"");

       // System.out.println(subsequencelist(s,""));

        //Arraylist inside function

       // System.out.println(subsequencein(s,""));


//        int a[] = {1,2,3};
////
//         ArrayList<Integer>  ans = new ArrayList<>() ;
////
//     subsequencearray(a,ans,0);





//        String s = "abc";
//
//        ArrayList<Character>  ans = new ArrayList<>() ;
//
//        subsequencearraychar(s,ans,0);


   //only 4 we will get out of 6
      //  System.out.println(perm(s,""));


           //  permuatations("",s);

       // System.out.println((int)'a');


        //String s = "abbaca";
        //1.RECURSIVE(Doesn't reconsider string again)

       // System.out.println(removeadjduplicates(s,""));

        //2.Iterative approach(not all cases)

        //System.out.println(removeadjiter(s));

      //3.USE STACK APPROACH IF THERE ARE ONLY 2 DUPLICATES ADJACENT


        //System.out.println(remadjstack(s));



     //test

        System.out.println(sumofn(10));









    }
}

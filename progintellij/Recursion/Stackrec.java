package Recursion;

import java.util.Stack;

public class Stackrec {

    //1.
    static Stack<Integer> insertionatbottom(Stack<Integer> st,int n){



        if(st.isEmpty())
        {
            st.push(n);
            return st;
        }

        int ele = st.pop();

       insertionatbottom(st,n);

       st.push(ele);

        return st;
    }

    //2.

    static Stack<Integer> ans = new Stack<>();
    static Stack<Integer> reverse(Stack<Integer> st){




        if(st.isEmpty())
        {
            return ans;
        }

        int ele = st.pop();

        ans.push(ele);

         return reverse(st);





    }


    static void reverse2(Stack<Integer> st){

        if(st.isEmpty())
        {
            return ;
        }

        int ele = st.pop();

        reverse2(st);

        insertionatbottom(st,ele);


    }



    public static void main(String[] args) {


        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(4);
        st.push(13);
        st.push(1);

        int n=1000;

        //1.insertion at bottom

      //  System.out.println( insertionatbottom(st,n));
     //   System.out.println(st.peek());

        //2.reverse stack using recursion

      //  System.out.println(reverse(st));

       reverse2(st);
        System.out.println(st);


    }
}

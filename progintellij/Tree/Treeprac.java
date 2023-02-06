package Tree;

import java.util.ArrayList;
import java.util.Scanner;
//
//        6
//        3
//        -1
//        1
//        -1
//        -1
//        2
//        100
//        -1
//        -1
//        -1

public class Treeprac {

    Scanner sc = new Scanner(System.in);
      class Node{

          Node left;
          Node right;
          int data;

          Node(int data){
              this.data=data;
          }
      }

     public Node createNode(){

          Node root=null;

         //System.out.println("Enter the data");

         int data = sc.nextInt();

         if(data==-1)
             return null;

         root = new Node(data);

         //System.out.println("enter left");

         root.left=createNode();

         //System.out.println("enter right");

         root.right = createNode();

         return root;
      }


      void preorder(Node root){

          if(root==null)return;

          System.out.print(root.data+" ");
          preorder(root.left);
          preorder(root.right);


      }

      //2.
      int height(Node root){

          if(root==null)return 0;

          return Math.max(height(root.left),height(root.right))+1;

      }

      //3.

    int size(Node root){

          if(root==null)return 0;

          return size(root.left)+size(root.right)+1;
      }

//    static int count=0;
//    int size(Node root){
//
//
//          if(root==null)return 0;
//
//          size(root.left);
//          size(root.right);
//          count++;
//
//          return count;
//
//
//    }

    //4.

    void levelordertraversal(Node root,int level){

          if(root==null)return;

          if(level==1)
              System.out.print(root.data+" ");

          else if(level>1){

              levelordertraversal(root.left,level-1);
              levelordertraversal(root.right,level-1);

          }



    }


    //5.

    static int max=0;
    int maxnode(Node root){

        if (root==null)return 0;

//        if(root.data> max)
//            max = root.data;
//
//        maxnode(root.left);
//        maxnode(root.right);
//
//        return max;


        return Math.max(root.data,Math.max(maxnode(root.left),maxnode(root.right)));

    }




    //6.
    static int sum=0;

     int sumofnodes(Node root){

        if(root==null)return 0;


//        sum+=root.data;
//        sumofnodes(root.left);
//        sumofnodes(root.right);
//
//        return sum;


        return root.data+sumofnodes(root.left)+sumofnodes(root.right);
    }

    //7.
     int countleaves(Node root) {


        if (root == null) return 0;

        //for sum of leave nodes
       // if(root.left==null && root.right==null)return root.data;

        if(root.left==null && root.right==null)return 1;


        return countleaves(root.left)+countleaves(root.right);

    }


    void leftview(Node root,ArrayList<Integer> al,int level){

         if(root==null)
             return;

         if(al.size()==level)
             al.add(root.data);

         leftview(root.left,al,level+1);
         leftview(root.right,al,level+1);

     }

     //9.
    void rightview(Node root,ArrayList<Integer> ar,int level){

        if(root==null)
            return;

        if(ar.size()==level)
            ar.add(root.data);

        rightview(root.right,ar,level+1);
        rightview(root.left,ar,level+1);

    }





    public static void main(String[] args) {

          Treeprac t = new Treeprac();

          Node root = t.createNode();

        System.out.println(" Preorder traversal is ");
          //1.preorder
          t.preorder(root);

          //2.height of tree
        System.out.println("heihgt of tree is "+t.height(root));

        //3.size of tree(no.of nodes)
        System.out.println("size of tree is "+t.size(root));


        //4.level order traversal

        for (int i=1;i<=t.height(root);i++){

            t.levelordertraversal(root,i);
        }


        //5.min or max element in a tree

        //System.out.println("max element in a tree "+t.maxnode(root));

        //6.Sum of nodes

       // System.out.println("sum of nodes "+sumofnodes(root));

        //7.count leaves

       System.out.println("count leaves "+t.countleaves(root));


        //8.

        System.out.println("left view of a tree is ");
        ArrayList<Integer> al = new ArrayList<>();
        t.leftview(root,al,0);
        System.out.println(al);

        //9.
        System.out.println("right view of a tree is ");
        ArrayList<Integer> ar = new ArrayList<>();
        t.rightview(root,ar,0);
        System.out.println(ar);


        //10.  11.  for top/bottom view of a tree refer notes1
    }
}

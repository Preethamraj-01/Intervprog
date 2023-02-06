package LinkedList;

class LL {

    // Implementation

    Node head;

    class Node{
        Node next;
        int data;

        Node(int data){
            this.data=data;
            this.next=null;
        }



    }



    // operations


    public void addFirst(int data) {

        Node newNode=new Node(data);

        if(head==null) {
            System.out.println("List is empty");
        }

        newNode.next=head;
        head=newNode;

    }

    public void addLast(int data) {
        Node newNode=new Node(data);
        if(head==null) {
            System.out.println("List is empty");
        }


        Node currNode=head;
        while(currNode.next!=null) {

            currNode=currNode.next;
        }

        currNode.next=newNode;

    }

    public void print() {
        if(head==null) {
            System.out.println("List is empty");
        }

        Node currNode=head;
        while(currNode!=null) {
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("null");

    }


    public void removeFirst() {
        head=head.next;
    }

    public void removeLast() {

        Node currNode=head;
        while(currNode.next.next!=null) {
            currNode=currNode.next;
        }
        currNode.next=null;
    }


    public void insert(int data,int index) {


        Node newNode=new Node(data);

        Node currNode=head;
        Node nextNode=head.next;
        int count=1;

        while(count!=index-1) {
            currNode=currNode.next;
            nextNode=nextNode.next;
            count++;
        }

        currNode.next=newNode;
        newNode.next=nextNode;

    }


    public int size() {
        int count=0;
        Node currNode=head;

        while(currNode!=null) {
            count++;
            currNode=currNode.next;
        }

        return count;


    }


    public void insertMiddle(int data) {


        Node newNode=new Node(data);

        Node s = head;
        Node f = head;

        Node cur = s.next;

        while (f!=null && f.next!=null){

            s=s.next;
            f=f.next.next;
            cur=cur.next;

        }

        s.next = newNode;
        newNode.next=cur;



//        int size=0;
//        Node currNode=head;
//
//        while(currNode!=null) {
//            size++;
//            currNode=currNode.next;
//        }
//
//
//        int mid=size/2;
//
//
//        Node cu=head;
//        Node nextNode=head.next;
//
//        if(mid%2==0) {
//            int count=1;
//            while(count!=mid) {
//                count++;
//                cu=cu.next;
//                nextNode=nextNode.next;
//            }
//            cu.next=newNode;
//            newNode.next=nextNode;
//
//        }
//        else {
//            int count=0;
//            while(count!=mid-1) {
//                count++;
//                cu=cu.next;
//                nextNode=nextNode.next;
//            }
//            cu.next=newNode;
//            newNode.next=nextNode;
//
//        }

    }


    //Get middle of linkedlist

    /*

    int getMiddle(Node head)
    {
         // Your code here.




        Node slow = head;
        Node fast = head;


        while(fast!=null  && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;



        }


        return slow.data;


        }
     */

    public void reverseList() {


        Node prevNode=null;
        Node currNode=head;



        while(currNode!=null) {
            Node nextNode =currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;


        }

        head=prevNode;
    }




   //sort a ll



       void sort(int n){

           Node curi = head;


        while(curi!=null){

           Node curj = curi.next;

            while(curj!=null){

                if(curi.data>curj.data){

                    int t = curi.data;

                    curi.data = curj.data;

                    curj.data = t;
                }

                curj = curj.next;
            }

            curi = curi.next;

        }

    }
    //Reverse a Linked List in groups of given size.

    public static Node reverse(Node node, int k)
    {
        //Your code here
        //node is head
        Node prevPtr = null;
        Node currPtr = node;
        Node nextPtr = currPtr.next;

        int count = 0;

        while (currPtr != null && count < k)
        {
            nextPtr = currPtr.next;
            currPtr.next = prevPtr;

            prevPtr = currPtr;
            currPtr = nextPtr;

            count++;
        }

        if (nextPtr != null)
            node.next = reverse(currPtr, k);

        return prevPtr;
    }

     void helper1(Node cur,Node nextn,int pos,int val){


        if(pos==1){

            Node n = new Node(val);

            cur.next=n;
            n.next=nextn;

            return;

        }


        cur=cur.next;
        nextn=nextn.next;

        helper1(cur,nextn,pos-1,val);

    }

    public Node insertatpos(Node head,int pos,int val){


       // Node head1=head;
        if(pos==0)
            return head;

        helper1(head,head.next,pos,val);

        return head;

    }
  /*
            // Detect loop in linked list

     public static boolean detectLoop(Node head){
        // Add code here


        Node slow = head;
        Node fast = head;



          while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

             if(slow==fast)return true;

        }


           return false;

    }

    //to find begining node of loop in linkedlist

   ListNode slow =  head;
     ListNode fast = head;

     ListNode start = head;

     if(head==null || head.next==null)return null;

     while( fast!=null  && fast.next!=null ){

        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast)
        {

        while(start!=slow){

        slow = slow.next;
        start=start.next;


         }

    return start;

         }

     }

     //NO LOOP Present

              return null;
     }
*/
    /*

    // Reverse Linked List II (reverse specific grp in linked list)

  public Node reverseBetween(Node head, int left, int right) {
        if(left==right) return head;

        Node prev = null;
        Node cur  = head;





        //we need to move to left-1 position

        for(int i=0;i<left-1;i++){

            prev=cur;
            cur=cur.next;


        }


        Node last = prev;
        Node newend = cur;

        //  Node temp = cur.next;
        for(int i=0;i<right-left+1;i++)
        {

            //reverse

            Node nextnode = cur.next;

            cur.next=prev;
            prev=cur;
            cur=nextnode;
        }

        if(last==null)
            head = prev;

        else{

            last.next = prev;

        }

        newend.next = cur;


        return head;

    }
      //Intersection of Two Linked Lists


   LinkedList<Integer> ll = new LinkedList<Integer>();
        Set<Integer> s1 = new LinkedHashSet<Integer>();
                Set<Integer> s2 = new LinkedHashSet<Integer>();


        while(head1!=null){

            s1.add(head1.data);
            head1=head1.next;
        }

        while(head2!=null){

            s2.add(head2.data);
            head2=head2.next;
        }

        s1.retainAll(s2);





       Node h = new Node(10000);

        Node k = h;

       for(int i:s1){

            Node ans = new Node(i);

            h.next = ans;

            h = ans;



        }

        return k.next;
 }


 160. Intersection of Two Linked Lists
 public Node getIntersectionNode(Node headA, Node headB) {

        Node l1 = headA;

        Node l2 = headB;

        int len1=0,len2=0;

        while(l1!=null){
            len1++;
            l1=l1.next;
        }

        while(l2!=null){
            len2++;
            l2=l2.next;
        }

        int diff = Math.abs(len1-len2);

        if(len1>len2){

          while(diff!=0){

           headA = headA.next;
          diff--;
          }
        }

          else{

           while(diff!=0){

           headB= headB.next;
          diff--;
          }

          }




        while(headA!=headB){
             headA = headA.next;

             headB= headB.next;

        }

        return headA;

    }

    //Remove Duplicates from Sorted List



        Node temp=head;

        if(head==null)
            return null;
        while(temp.next!=null){

            if(temp.next.val == temp.val)
                temp.next=temp.next.next;

            else
                temp=temp.next;



        }


        return head;

    }
    
    //82. Remove Duplicates from Sorted List II(contain only unique)
    
   
 * Definition for singly-linked list.
 * public class Node {
 *     int val;
 *     Node next;
 *     Node() {}
 *     Node(int val) { this.val = val; }
 *     Node(int val, Node next) { this.val = val; this.next = next; }
 * }
 
   class Solution {
       public Node deleteDuplicates(Node head) {

           Node cur  = head;
           Node h = new Node(0,head);
           Node newn = h;

           while(cur!=null){

               if(cur.next!=null && cur.next.val == cur.val){
                   while(cur.next!=null &&  cur.val==cur.next.val)
                   {

                       cur  = cur.next;
                   }
                   newn.next = cur.next;

               }

               else{


                   newn = newn.next;

               }

               cur = cur.next;

           }

           return h.next;

       }
   }

   //****   MERGE TWO LL IS SAME AS IN ARRAY


   
    */







    public static void main(String[] args) {
        LL list=new LL();

        list.addFirst(23);
        list.addLast(39);
        list.addLast(44);
        list.print();
        list.removeFirst();
        list.print();
        list.removeLast();
        list.print();

        list.insert(125,2);
        list.print();


        list.insertMiddle(225);
        list.print();

        System.out.println(list.size());

//		list.insertMiddle(555);
//		list.print();


        System.out.println("Reverse a list");
        list.reverseList();
        list.print();

        System.out.println(list.size());

        System.out.println("Sort a list");
        list.sort(list.size());

        list.print();


        list.addLast(3);

        list.print();

//        list.removeLast();
//        list.removeLast();
//        list.removeLast();

        //  insert at specific position using RECURSION

       list.insertatpos(list.head,1,10);

        list.print();

        list.insertMiddle(1000);
        list.print();





    }

}
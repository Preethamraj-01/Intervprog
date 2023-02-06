package Stack;
import java.util.*;

public class Node {
	
	
	Node top;
	
	Node next;
	
	//Node tail;
	
	int data;
	
	int size=0;
	
	
	Node(int ele){
		
		
		
		this.data =ele;
		
		this.next=null;
		
		
		
	}
	
	class stack{
		
		
	  public void push(int ele) {
		  
		  
		  Node n = new Node(ele);
		  
		  n.next = top;
		  
		  size++;
		  
		  top = n;
		  
	  }
	  
	  public int pop() {
		  
		  if(isempty())
			  throw new EmptyStackException();
			 // System.out.println(" stack underflow");
		  
		  
		  int pelement = top.data;
		  
		  top = top.next;
		  
		  
		  size--;
		  
		  return pelement;
		  
		  
	  }
	  
	  
	  public int peek() {
		  
		  if(isempty())
			  throw new EmptyStackException();

			  
		   return top.data;
		  
	  }
	  
	  public int size() {
		  
		  return size;
		  
	  }
		
		
		
	  public boolean isempty() {
		  
		  
		  return size==0;
		  
		  
	  }
	  
	  public void display() {
		  
        Node cur = top;
		  
		  while(cur != null) {
			  
			  System.out.println(" stack elemnt " + cur.data);
			  
			  
			  cur = cur.next;
		  }
		  
		  
	  }
		
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		Node n1 = new Node(10);
		
		
		Node.stack sob = n1.new stack();
		
		
		sob.push(11);
		sob.push(14);
		sob.push(16);
		sob.push(5);
		sob.push(1);
		
		System.out.println("size is " + sob.size());

		
		System.out.println("popped element is " + sob.pop());
		System.out.println("popped element is " + sob.pop());
		System.out.println("popped element is " + sob.pop());
		System.out.println("popped element is " + sob.pop());

		//System.out.println("popped element is " + sob.pop());
		//System.out.println("popped element is " + sob.pop());

		System.out.println("top element is " + sob.peek());
		
		
		System.out.println("size is " + sob.size());


		
		
		sob.display();

	}

}

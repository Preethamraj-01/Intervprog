package Queue;

import java.util.*;

public class Nodelist {
	
	Nodelist front ;
	
	Nodelist rear ;
	
	Nodelist next;
	
	int data;
	
	int size ;
	
	
	Nodelist(int data){
		
		this.data = data;
		
		
		//initially pointing to null
		this.next=null;
		
		size=0;
		
		
	}
	
	
	class queue{
		
	
	public void enqueue(int element) {
		
		
		
		Nodelist n = new Nodelist(element);
		
          if(front==null) {
			
			front=rear=n;
		}
		
		rear.next = n;
		
		rear = rear.next;
		
		size++;
		
	}
	
	public int dequeue() {
		
		
		if(rear==front) {
			
			System.out.println(" queue is empty");
			
			throw new NoSuchElementException();
		}
		
		int remelement = front.data;
		
		front = front.next;
		
		size--;
		
		return remelement;
	}
	
	
	void display() {
		
		Nodelist cur = front;
		
		
		System.out.println("elemnts are");

		
		while(cur!=null) {
			
			
			
			System.out.println(" "+cur.data);
			
			cur = cur.next;
			
		}
		
		
	}
	
	int size() {
		
		return size;
	}
	
	
	}
	public static void main(String[] args) {
		
		
		Nodelist node = new Nodelist(5);
		
		//node.rear = node;
		
		Nodelist.queue q = node.new queue();
		
		q.enqueue(9);
		
		q.enqueue(29);
		q.enqueue(8);
		q.enqueue(3);
		
		
		System.out.println("removed elemnt are "+q.dequeue());
		
		System.out.println("removed elemnt are "+q.dequeue());

		System.out.println("removed elemnt are "+q.dequeue());

		System.out.println("removed elemnt are "+q.dequeue());

		
		System.out.println("size is "+q.size());


		q.display();
		

	}

}

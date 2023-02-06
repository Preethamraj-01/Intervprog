package Queue;
import java.util.*;

public class queArrayimp {
	
	
	int a[];
	
	int size=0;
	
	int front=-1;
	
	int rear = -1;
	
	
	queArrayimp(int size){
		
		
		a= new int[size];
		
	}
	
	
	void offer(int ele) {
		
		
		if(rear==a.length-1) {
			System.out.println(" queue overflow ");
		return ;
		}
		
		a[++rear] = ele;
		
		size++;
		
		
	}
	
	public int poll() {
		
		
		if(front==rear) {
			
			System.out.println(" queue underflow ");

			throw new NoSuchElementException();
			
		}
		int remele = a[++front];
		
		
		size--;
		
		return remele;
		
	}
	
	
	void display() {
		
		
		
		
		for(int i=front+1;i<=rear;i++) {
			
			
			System.out.println(""+a[i]);
			
			
		}
		
		
		
		
	}
	
	
	
	
	int size() {
		
		return size;
	}
	
	
	public static void main(String[] args) {

		queArrayimp q = new queArrayimp(5);
		
		q.offer(9);
		
		q.offer(19);
		q.offer(90);
		
		//System.out.println("size is "+q.size());

		q.offer(10);
		
		
		
		System.out.println("removed ele "+q.poll());

		System.out.println("removed ele "+q.poll());
		
		System.out.println("removed ele "+q.poll());
		
		System.out.println("removed ele "+q.poll());

		//System.out.println("removed ele "+q.poll());

		
		//q.offer(7);
		
		System.out.println("size is "+q.size());
		
		//q.offer(12);

		
		q.display();

		
	}

}

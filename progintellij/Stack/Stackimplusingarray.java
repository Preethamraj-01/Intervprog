package Stack;

public class Stackimplusingarray {
	
	
	
	int size;
	int top = -1;
	int a[];
	
	Stackimplusingarray(int size){
		
		this.size = size;
		
		a = new int[size];
		
		
		
		
	}
	
	
	
	public void push(int element) {
		
		
		if(top==size-1)
			 System.out.println(" stack overflow");
		
		else a[++top] = element;
		
		
	}
	
	
	public int pop() {
		
		
		
		if(top==-1)
			System.out.println(" stack underflow");
		
		
		else {
		int pelement = a[top];
		
		top--;
		
		return pelement;
		}
		
		
		return -1;
		
		
	}
	
	
	
	
	public void display() {
		
		
		for(int i=top;i>=0;i--) {
			
			
			System.out.println(" stack elemnet at pos"+i +" = "+  a[i]);
			
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Stackimplusingarray sobj = new Stackimplusingarray(5);
		
		sobj.push(8);
		
		sobj.push(18);

		sobj.push(10);
		
		sobj.push(1);

		sobj.push(100);

		sobj.push(12);
		
		System.out.println(" popped eleemnt is "+sobj.pop());

		System.out.println(" popped eleemnt is "+sobj.pop());

		System.out.println(" popped eleemnt is "+sobj.pop());
		
		System.out.println(" popped eleemnt is "+sobj.pop());
		
		System.out.println(" popped eleemnt is "+sobj.pop());

		//System.out.println(" popped eleemnt is "+sobj.pop());

		sobj.display();
		
	}

}

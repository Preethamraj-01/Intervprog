package Graph;

import java.util.*;

public class bfs {
	
	static int v;

	public static ArrayList<Integer> bfsq(int adj[][],int src) {
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		Queue<Integer>  q = new LinkedList<>();
		
		boolean vis[] = new boolean[v];
		
		for(int i=0;i<v;i++)
			vis[i] = false;
		
		
		//init
		
		q.add(src);

		vis[src] = true;
		
		
		while(!q.isEmpty()) {

		int val = q.poll();
		al.add(val);
		
		for(int i=0;i<v;i++) {
			
			//not visited
			if(adj[val][i]==1 && vis[i]==false) {
				
				q.add(i);
				
				vis[i]=true;
				

			}
			
		}
		
		//System.out.println(al);
	}
		
		return al;
	}
	
	
	
	
	static  ArrayList<Integer> dfs(int[][] adj,int v ){
		
		
		 ArrayList<Integer> al = new  ArrayList<Integer>();
		dfsRec(adj , al, 0);
	       
	       return al;
	   }
	
	  static  public ArrayList<Integer> dfsRec(int[][] adj , ArrayList<Integer> al , int source){
	  
	      al.add(source);
	 
	      
	       for(int j=0;j<adj.length;j++) {
	    	   
	    	   
	    	   if(adj[source][j]==1 && !al.contains(j)) {
	               dfsRec(adj  , al, j);
	           }
	       
	       }
	       return al;
	   }
	  
	  
	  
	  static ArrayList<Integer> dfstack(int[][] adj,int src){
		  
		  
		  ArrayList<Integer> al = new ArrayList<Integer>();
		  
		  
		 Stack<Integer> s = new Stack<Integer>();
		 
		 s.push(src);
		// al.add(src);
		 int u;
		
		  
		  while(!s.isEmpty()) {
			  
			  u = s.pop();
			  al.add(u);
			  
			  for(int j=0;j<adj.length;j++) {
				  
				  
				  if(adj[u][j]==1  && !al.contains(j))
					  s.push(j);
				  
				  
			  }
		  }
			
			  return al;
	  }
		
		
		
		
	
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("enter vertex");
		
		 v = s.nextInt();
		
		System.out.println("enter src vertex");
		
		int src = s.nextInt();

		
		int adj[][] = new int [v][v];
		
		for(int i=0;i<v;i++) {
			
			//System.out.println("enter for vertex"+ i);
			
			for(int j=0;j<v;j++) {
				
				adj[i][j] = s.nextInt();
				
			}
		}
		
		

		
	System.out.println(bfsq(adj,src));
		
		//System.out.println(dfs(adj,v));
		
		System.out.println(dfstack(adj,0));

		
		//System.out.println(adj.length);
		
			
	}

}

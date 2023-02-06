package Graph;
import java.util.*;

public class ImplusingLL {
	
	
	//Array of LL
	LinkedList<Integer> adj[];
	
	ImplusingLL(int v){
		
		//array initialization
		adj = new LinkedList[v];

	
	for(int i=0;i<v;i++) {
		
		//LL initialization

		adj[i] = new LinkedList<Integer>();
		
		
	}
	

}
	
	
	public void addedge(int src,int dest) {
		
		
		adj[src].add(dest);
		
		// since its an undirected graph

		
		adj[dest].add(src);

		
	}
	
	
	public int bfs(int src,int dest) {
		
		
		boolean vis[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		
		q.add(src);
		//parent to determine which vertex referred which vertex
		parent[src] = -1;
		vis[src]=true;
		
		
		while(!q.isEmpty()) {
			
			int cur = q.poll();
			
			if(cur == dest) break;
			
			for(int neighbour:adj[cur]) {
				if(!vis[neighbour]) {
					
					vis[neighbour] = true;
					
					q.add(neighbour);
					
					parent[neighbour] = cur;
					
					
				}
				
				
				
			}
			
			
		}
		
		
		int cur = dest;
		int dist=0;
		
		System.out.print(src+" -- > ");

		//stop when reached src
		while(parent[cur] != -1) {
			
			
			System.out.print(cur+" -- > ");
			dist++;
			cur = parent[cur];
			
		}
		
		
		
		
		return dist;
	}
	
	
	public boolean dfs(int src,int dest) {
		
		boolean vis[] = new boolean[adj.length];
       vis[src]=true;
       
       Stack<Integer> st = new Stack<Integer>();
       
       st.push(src);
       
       while(!st.isEmpty()) {
    	   
    	   
    	   int cur = st.pop();
    	   
    	   if(cur == dest) return true;
    	   
    	   
    	   for(int neig : adj[cur]) {
    		   
    		   if(!vis[neig]) {
    			   
    			   vis[neig] = true;
    			   
    			   st.push(neig);
    			   
    			   
    			   
    		   }
    		   
    		   
    	   }
    	   
    	   
       }
		
		
	   return false;

		
	}

	public static void main(String[] args) {
		
		 System.out.println("Enter no.of vertices and edges");

		 
		 Scanner s = new Scanner(System.in);
		
		 int v = s.nextInt();
		 int e = s.nextInt();

		 
		 ImplusingLL gr = new  ImplusingLL(v);
		 
		 System.out.println("enter the "+e+"edges");
		 
		 for(int i=0;i<e;i++) {
			 
			 //to form edge
			 int src = s.nextInt();
			 int dest = s.nextInt();
			 
			 gr.addedge(src,dest);
			 
			 
		 }
		 
		// int mindist = gr.bfs(0, 3);
		// System.out.println("min dist is "+mindist);
		 
		 System.out.println(gr.dfs(1, 0));
		 
		
	}

}

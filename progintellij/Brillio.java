import java.util.Arrays;

public class Brillio {
	
	

	 static public void main(String[] args) {
		
		int [] input2 = {3,4,1,5,2};
		
		int k;
		//System.out.println(k);

		
		System.out.println(Arrays.toString(placement(input2.length,input2)));

	}
	
	  static public int[]  placement(int input1,int[] input2) {
		
		
		
	    int counter;
	    
	    int ans[] = new int[input1];
	    
	    ans[0] =0;
	    
	    for(int i=1; i<input1; i++){
	    	
	        counter = 0;
	        
	        for(int j=0; j<i; j++){
	        	
	            if (input2[j] > input2[i]){
	                counter += 1;
	            }
	            
	        }
	        
	        ans[i] = counter;
	        	
	    }
		
		return ans;
		
	}

}

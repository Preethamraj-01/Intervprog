package bits;

public class differncebits {
		    
		    public static void main(String args[]){
		    
		    
		    int a=34,b=7;
		    
		    System.out.println(countBitsFlip(a,b));
		    
		    System.out.println(a^b);
		    
		    
           int i=100;
           
           System.out.println(Integer.toString(i));
		    
		    
		    }
		    
		    
		    // wrong approach
		    public static int countBitsFlip(int a, int b){
		        
		        // Your code here
		        
		        int c=0;
		        
		        int k = a^b;
		        
		        while(k>0){
		            
		            
		            if((k&1)==1){
		                
		                
		                c++;
		                
		                
		            }
		            
		          k=k>>1;
		            
		        }
		        
//		        String s1 = Integer.toBinaryString(a);
//		        String s2 = Integer.toBinaryString(b);
//		        
//		        int j=0;
//		        
//		        for(int i=0;i<s1.length();i++,j++){
//		            
//		           if(s1.charAt(i) != s2.charAt(j)) {
//		               
//		               
//		               c++;
//		               
//		               
//		               
//		           }
//		            
//		            
//		            
//		        }
		        return c;
		    }
		    
		        
		    }
		    
		    
		
	



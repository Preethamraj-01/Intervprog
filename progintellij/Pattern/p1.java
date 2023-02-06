package Pattern;

public class p1 {
	
	//i = row
	//j = column
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		// 1
		
		
//		for(int i=0;i<5;i++) {
//			
//			for(int j=0;j<=i;j++) {
//				
//				System.out.print(" * ");
//			}
//			System.out.println();
//			
//		}
		
		
		//2
		
		
	int n=4;
	
		pattern12(n);


}
	
	static void pattern2(int n) {
		
        for(int i=0;i<n;i++) {
		
		for(int j=0;j< n - i+1 ;j++) {
			
			System.out.print(" * ");
		}
		System.out.println();
		
	}
	
	
}
	
	static void pattern3(int n) {
		
		
		for(int i=1;i<n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" "+j);
			}
			
			System.out.println();
			
		}
		
		
		
	}
	
   static void pattern4(int n) {
		
		
		for(int i=1;i<n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" "+2*j);
			}
			
			System.out.println();
			
		}
		
		
		
	}
   
   
   static void pattern5(int n) {
		
		
		for(int i=1;i<n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
         for(int i=1;i<n;i++) {
			
			for(int j=1;j<n-i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
		
	
		
		
		
	}
   
   
   static void pattern6(int n) {
	   
	   
	   
	   for(int i=0;i<n;i++) {
		   
		   
		   for(int sp=0;sp<=i;sp++) {
			   
			   System.out.print(" ");
			   
		   }
		   
		   for(int j=0;j<n-i;j++) {
			   
			   System.out.print("*");
			   
			   //for upper star
			   // System.out.print("* ");

			   
			   
		   }
		   
		   
		   System.out.println();
		   
	   }
	   
	   
	   
	   
	   
   }
   
     static void pattern7(int n) {
    	 
    	 
    	 
    	 for(int i=0;i<2*n;i++) {
  		   
  		   
    		 int tcols = i > n ? 2 * n - i:i;
    		 
    		 
  		   for(int sp=0;sp< n-tcols;sp++) {
  			   
  			   System.out.print(" ");
  			   
  		   }
  		   
  		   for(int j=0;j< tcols;j++) {
  			   
  			   System.out.print("* ");
  			   
  		   }
  		   
  		   
  		   System.out.println();
  		   
  	   }
    	 
    	 
    	 
    	 
    	 
    	 
     }
     
     
     
     static void pattern8(int n) {
    	 
    	 int m=1;
    	 for(int i=1;i<n;i++) {
    		 
    		 for(int j=1;j<=i;j++) {
    			 
    			 
    			 System.out.print(" "+(m++));
    			 
    			 
    		 }
    		 System.out.println();
    		 
    	 }
    	 
    	 
    	 
     }
     
     
     static void pattern9(int n)
     {
    	 
    	 
    	 
    	 
    	 for(int i=1;i<n;i++) {
    		 
    		 
    		 for(int sp=1;sp<=n-i;sp++) {
    			 
    			 System.out.print(" ");
    		 }
    		 
    		 
    		 
    		 for(int j=i;j>=1;j--) {
    			 
    			 System.out.print(""+j);
    			 
    		 }
    		 
    		 
               for(int j=2;j<=i;j++) {
    			 
    			 System.out.print(""+j);
    			 
    		 }

    		 
    		 System.out.println();
    	 }
    	 
     }
	
     
     static void pattern10(int n) {
    	 
    	 
    	 
    	 
    	 
    	   for(int i=0;i<=2*n;i++) {
    		   
    		   for(int j=0;j<=2*n;j++) {
    			   
    			   
    			   System.out.print(" "+  Math.min(   Math.min(j,2*n-j ),Math.min(i,2*n-i )  ) );
    			   
    		   }
    		   
    		   
    		   System.out.println();
    	   }
    	 
    	 
    	 
    	 
    	 
    	 
     }
     static void pattern11(int n) {
    	 
    	 
    	 
    	 
    	 
  	   for(int i=1;i<2*n;i++) {
  		   
  		   for(int j=1;j<2*n;j++) {
  			   
  			   
  			   System.out.print(" "+ (n+1 - Math.min(   Math.min(j,2*n-j ),Math.min(i,2*n-i )  )) );
  			   
  		   }
  		   
  		   
  		   System.out.println();
  	   }
  	 
  	 
  	 
     }
     
     
     static void pattern12(int n) {
    	 
    	 
    	 for(int i=0;i<2*n;i++) {
    		 
    		 
    		 int tcols = i>n ? 2*n-i:i;
    		 
    		 int tsp = i>n? 2*(i-n):2*(n-i);
    		 
    		 for(int j=1;j<=tcols;j++) {
    			 
    			 
    			 
    			 System.out.print("*");
    		 }
    		 
    		for(int sp=1;sp<=tsp;sp++) {
    			
    			System.out.print(" ");
    			
    		}
    		 

//    		if(i>n)
//             for(int sp1=1;sp1<=2*(i-n);sp1++) {
//    			
//    			System.out.print(" ");
//    			
//    		}
    		
    		for(int j=1;j<=tcols;j++) {
   			 
   			 
   			 
   			 System.out.print("*");
   		 }
    		 
    		
             
             
    		 System.out.println();
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
     }
	
}
	
	

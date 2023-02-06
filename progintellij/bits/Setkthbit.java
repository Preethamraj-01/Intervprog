package bits;

public class Setkthbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(setKthBit(10,2));
		
		
		//   N = N|(1<<k);
		
	}
	
	static int setKthBit(int N,int K){
        // code here
        
        String ans="";
        String s = Integer.toBinaryString(N);
        
        StringBuilder b =  new StringBuilder(s);
        
        for(int i=s.length()-1;i>=0;i--){
            
            
            if(s.charAt(i) == '0'  &&  K ==( s.length()-(i+1) )){
            	b.setCharAt(i, '1');
            	

               break;
            }
            
            
            
        }
        
        //System.out.println(ans);
        
       ans = new String(b);
        
        return Integer.parseInt(ans,2);
        
	}

}

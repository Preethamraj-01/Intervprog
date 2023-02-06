package bits;
import java.util.*;abstract
public class flipbits {

	public static void main(String arg[]) {
		
		
		int a =10;
		
		
		int x = (int)(Math.log(a)/Math.log(2))+1;
		
		//System.out.println(x);
		
		
		for(int i=0;i<x;i++) {
			
			
			a  = a ^ (1<<i);
			
		}
		
		System.out.println(a);
	}
}

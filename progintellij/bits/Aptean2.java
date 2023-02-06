package bits;
import java.util.*;

public class Aptean2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,1,4};
		
		System.out.println(getcost(5,2,a,a.length));
		
		
	}
	
	
	static long getcost(int x,int k,int[] price,int N) {
		
		
		long result = 0;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		for(int i=0;i<price.length;i++) {
			
			if(!al.contains(price[i]))
				al.add(price[i]);
			
			
			
		}
		
		
		int m = al.size() - k;
		
		result = m * x;
	
		
		return result;

	}

}

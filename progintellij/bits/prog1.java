
public class prog1 {

	
public static void main (String args[]){
	
	
	
	int a =5;
	int b=10;
	
	int count=0;
	
	for(int i=5;i<=10;i++) {
		
		int k=0;
		String s = Integer.toBinaryString(i);
		
		System.out.println(s);
		
		for(int j=0;j<s.length();j++)
			if(s.charAt(j)=='0')
		     k++;
		
		if(k==1)
			count++;
	}
	
	
	System.out.println(count);
}
	
}

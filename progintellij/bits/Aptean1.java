package bits;

import java.util.Arrays;

public class Aptean1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {9,3,7,5,1};
		solution(arr.length,arr);
		

	}
	
	static int[] solution(int N,int[] arr) {
		
		
		int[] result = {0};
		
		result = new int[2];
		
		Arrays.sort(arr);
		
		int k = arr.length;
		
		
		
		result[0] = arr[k-1];
		
		result[1] = arr[k-2];
		

		
		return result;
	}

}

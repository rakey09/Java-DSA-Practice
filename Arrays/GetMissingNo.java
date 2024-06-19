package test;

public class GetMissingNo {
	static int missingNo(int[] arr,int n) {
		int sum = 0;
		int N = n+1;
		
		for(int i = 0;i < n;i++) {
			sum = sum + arr[i];
		}
		return ((N*(N-1))/2-sum);
	}

	public static void main(String[] args) {
		int[] arr = {3, 0, 1};
		int n = arr.length;
		System.out.println( missingNo(arr,n));
		

	}

}

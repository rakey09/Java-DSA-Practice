package test;

public class MaximumProduct0fTwoIntegers {
	
	static void maxProduct(int[] arr, int len) {
		if(len <2) {
			System.out.println("Insufficent elements");
			return;
		}
		int a = arr[0];
		int b = arr[1];
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[i]* arr[j] > a*b) {
					a = arr[i];
					b = arr[j];
				}
			}
		}
		System.out.println(a * b);
		
	}

	public static void main(String[] args) {
		int[] array = {1, 10, 2, 6, 5, 3};
		int len = array.length;
		maxProduct(array,len);
		
	}

}

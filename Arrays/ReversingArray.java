package test;
public class ReversingArray {
	
	static void reversingArray(int arr[]) {
		int start = 0;
		int end = arr.length -1;
		int temp = 0;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	static void printArray(int arr[]) {
	 for(int i : arr) {
		 System.out.print(i+" ");
	 }
	}
    public static void main(String[] args) {
    	int[] arr = {1, 2, 3, 4, 5};
    	reversingArray(arr);
    	printArray(arr);
    	
       
    }
}
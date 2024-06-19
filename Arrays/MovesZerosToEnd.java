package test;

public class MovesZerosToEnd {
	static void pushZerosToEnd(int[] arr,int n) {
		int count = 0;
		
		for(int i=0;i<n;i++) {
			if(arr[i] != 0) {
				arr[count++] = arr[i];
			}
			
		}
		while(count < n) {
			arr[count++]=0;
		}
	}

	public static void main(String[] args) {
		int[] array = {0, 1, 0, 3, 12};
		int n = array.length;
		pushZerosToEnd(array,n);
		for (int i=0; i<n; i++) 
            System.out.print(array[i]+" "); 
    } 
}

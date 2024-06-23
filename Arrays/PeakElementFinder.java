package test;

public class PeakElementFinder {
	

	    public static int findPeakElement(int[] nums) {
	        int low = 0;
	        int high = nums.length - 1;

	        while (low < high) {
	            int mid = low + (high - low) / 2;

	            if (nums[mid] > nums[mid + 1]) {
	                
	                high = mid;
	            } else {
	               
	                low = mid + 1;
	            }
	        }

	        
	        return nums[low];
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 3, 20, 4, 1, 0};
	        int peak = findPeakElement(array);
	        System.out.println("Peak element: " + peak);
	    }
	}



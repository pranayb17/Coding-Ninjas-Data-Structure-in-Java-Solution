// Binary Search (Recursive)
// Send Feedback
// Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.

// Return -1 if x is not present in the given array.
// Note : If given array size is even, take first mid.
// Input format :

// Line 1 : Array size

// Line 2 : Array elements (separated by space)

// Line 3 : x (element to be searched)

// Sample Input :
// 6
// 2 3 4 5 6 8 
// 5 
// Sample Output:
// 3 

public class solution {

	
	public static int binarySearch(int arr[],int num) {
		
		int low=0;
		int high=arr.length-1;
		return binarySearch(arr,low,high,num);
	}
	
	
	public static int binarySearch(int arr[],int low,int high,int num) {
		
		if(low>high) return -1;
			
		int mid=(low + high)/2;
		
		
		if(arr[mid]==num) {
			return mid;
		}
		else if(num < arr[mid]) {
			return binarySearch(arr, low, mid-1, num);
		}
		else {
			return binarySearch(arr, mid+1, high, num);
		}

	}
}




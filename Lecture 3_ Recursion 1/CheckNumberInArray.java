// Check Number in Array
// Send Feedback
// Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
// Do this recursively.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// 'true' or 'false'
// Constraints :
// 1 <= N <= 10^3
// Sample Input 1 :
// 3
// 9 8 10
// 8
// Sample Output 1 :
// true
// Sample Input 2 :
// 3
// 9 8 10
// 2
// Sample Output 2 :
// false

public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		
		int len=input.length;
		
		  if(input[0]==x)  return true;
	         
	        if( len==1) return false;
	        
		
		int arr[]=new int[len-1];
		for(int i=1;i<len;i++) {
			arr[i-1]=input[i];
		}
		
		
		
		boolean Smallans= checkNumber(arr,  x);
		
		return Smallans;
}
}

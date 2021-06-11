// All Indices of Number
// Send Feedback
// Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
// Do this recursively. Indexing in the array starts from 0.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// indexes where x is present in the array (separated by space)
// Constraints :
// 1 <= N <= 10^3
// Sample Input :
// 5
// 9 8 10 8 8
// 8
// Sample Output :
// 1 3 4


public class Solution {
    
    
    public static int[] allIndexes(int input[], int x, int si) {
        
        if(si == input.length){
            int arr[] = new int[0];
            return arr;
        }
        
        int smallArr[] = allIndexes(input, x, si + 1);
        if(input[si] == x){
            int arr[] = new int[smallArr.length + 1];
            arr[0] = si;
            for(int i = 0; i < smallArr.length; i++){
                arr[i + 1] = smallArr[i];
            }
            return arr;
                
        }else{
            return smallArr;
        }
        
        
    }
    
    
    
       
    public static int[] allIndexes(int input[], int x) {
        
        return allIndexes(input, x, 0);
    }
        
    
}
	

	


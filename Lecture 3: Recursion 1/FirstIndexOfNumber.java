// First Index of Number
// Send Feedback
// Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
// First index means, the index of first occurrence of x in the input array.
// Do this recursively. Indexing in the array starts from 0.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// first index or -1
// Constraints :
// 1 <= N <= 10^3
// Sample Input :
// 4
// 9 8 10 8
// 8
// Sample Output :
// 1





public class Solution {
    
//     public static int firstIndex(int input[] , int x) {
        
//         if(input.length == 0) {
//             return -1;
//         }
        
//         if(input[0] == x){
//             return 0;
//         }
        
//         int smallArray[] = new int [input.length - 1];
//         for(int i = 1; i < input.length; i++){
//             smallArray[i - 1] = input[i];
//         }
        
//         int fi = firstIndex(smallArray, x);
//         if(fi == -1){
//             return -1;
//         }else{
//             return fi + 1;
//         }
//     }
    
    
    
    
     public static int firstIndexBetter(int input[] , int x, int si) {
         
         if(si == input.length){
             return -1;
         }
         
         if(input[si] == x){
             return si;
         }
         
         int k = firstIndexBetter(input, x, si + 1);
         
         return k;
         
         
     }
    
    
    
    
    
    public static int firstIndex(int input[] , int x) {
        
        return firstIndexBetter(input, x, 0);
        
    }
    
    
    
    
    
     
    
    
    
	
//     private  static int firstIndex(int input[],int StartIndex,int x) {
        
//         if(input[StartIndex] == x) {
//             return StartIndex;
//         }    
        
// 		if(StartIndex >= input.length - 1 && input[StartIndex] != x ) {
//             return -1;
//         }
		
// 		int SmallAns = firstIndex(input, StartIndex + 1, x);
// 			return SmallAns;
// 		}  
		
// 	    public static int firstIndex(int input[] , int x) {
// 		    return firstIndex(input, 0, x);
// 	 }
	
}

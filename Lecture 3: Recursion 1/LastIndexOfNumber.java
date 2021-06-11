// Last Index of Number
// Send Feedback
// Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
// Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
// You should start traversing your array from 0, not from (N - 1).
// Do this recursively. Indexing in the array starts from 0.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// last index or -1
// Constraints :
// 1 <= N <= 10^3
// Sample Input :
// 4
// 9 8 10 8
// 8
// Sample Output :
// 3



public class Solution {
    
     public static int lastIndex(int input[], int x) {
         
         if(input.length == 0){
             return -1;
         }
         
         int smallArray[] = new int [input.length - 1];
         for(int i = 1; i < input.length; i++){
             smallArray[i - 1] = input[i];
         }
         
         int k = lastIndex(smallArray, x);
         if(k != -1){
             return k + 1;
         }else{
             if(input[0] == x){
                 return 0;
             }else{
                 return -1;
             }
         }
     }
    
    
    
    
    
    //     public static int lastIndex(int input[], int x, int si) {
        
//         if(si == input.length){
//             return -1;
//         }
        
//         int k = lastIndex(input, x, si + 1); 
        
//         if(k != -1){
//             return k;
//         }else{
            
//             if(input[si] == x){
//                 return si;
//             }else{
//                 return -1;
//             }
            
//         }
		
		
// 	}
    
//     public static int lastIndex(int input[], int x) {
		
// 		return lastIndex(input, x, 0);
// 	}
    
    
    
    
    
    
    
     
    
    
    
//         static int count = -1;

//         private static int lastIndex(int input[], int StartIndex , int x) {
		
		
// 		if(input[StartIndex] == x) {
// 			 count = StartIndex ;	
// 		}
		
           
// 		if(StartIndex >= input.length - 1) {
			
// 			if(input[StartIndex] == x) {
//                  return StartIndex; 
//             } 
//             else{
//                 return count;	  
//             }	
			                             
// 		}
		
                 
// 		int SmallAns = lastIndex(input, StartIndex + 1, x);
// 		return SmallAns;
		
// 	}
	
     
// 	public static int lastIndex(int input[], int x) {
		
// 		return lastIndex(input, 0, x);
// 	}

}

// Quick Sort Code
// Send Feedback
// Sort an array A using Quick Sort.
// Change in the input array itself. So no need to return or print anything.


// Input format :
// Line 1 : Integer n i.e. Array size
// Line 2 : Array elements (separated by space)
// Output format :
// Array elements in increasing order (separated by space)
// Constraints :
// 1 <= n <= 10^3
// Sample Input 1 :
// 6 
// 2 6 8 5 4 3
// Sample Output 1 :
// 2 3 4 5 6 8
// Sample Input 2 :
// 5
// 1 5 2 7 3
// Sample Output 2 :
// 1 2 3 5 7 


public class Solution {
	
	  public static void quickSort(int[] input) {
		
    	
    	int e =input.length-1;
    	int s =0;
            
    	Sort(input,s , e);
    		
    }
    
    
    private static void Sort(int[] arr,int s,int e) {
        
		 if (s<e){
	            int pivot = partition(arr, s, e);
	            Sort(arr, s, (pivot-1));
	            Sort(arr, (pivot+1), e);
         }
	}

	private static int   partition (int[] arr, int s, int e){
		
		int pivot=arr[e];           //last element as pivot
		int pindex=s;               
		
		for (int i=s;i<e;i++) {   
			
			    if(arr[i]<=pivot) {
				
				int temp1=arr[i];
				arr[i]=arr[pindex];
				arr[pindex]=temp1;
				pindex++;	
			}
		}
		
		    int temp2=arr[e];
		    arr[e]=arr[pindex];
		    arr[pindex]=temp2;
		
		 return pindex;
    
		
	}
	

        

	
}

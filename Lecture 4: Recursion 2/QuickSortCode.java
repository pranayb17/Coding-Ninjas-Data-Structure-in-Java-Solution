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
    
    private static int  partition (int[] input, int si, int ei) {
        int pivot = input[si];
        int count = 0;
        for(int i = si + 1; i <= ei; i++){
            if(input[i] <= pivot){
                count++;
            }
        }
        
        int pivotpos = si + count;
        int temp = input[pivotpos];
        input[pivotpos] = input[si];
        input[si] = temp;
        
        int i = si;
        int j = ei;
        
        while(i < pivotpos && j > pivotpos){
            if(input[i] <= pivot){
                i++;
            }else if(input[j] > pivot){
                j--;
            }else{
                temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }
        
        return pivotpos;
        
    }
    
    
    public static void quickSort(int[] input, int si, int ei) {
        if(si >= ei){
            return;
        }
        
        int pivotpos = partition(input, si, ei);
        quickSort(input, si, pivotpos - 1);
        quickSort(input, pivotpos + 1, ei);
             
    }
    
    
    public static void quickSort(int[] input) {
        quickSort(input, 0, input.length - 1);    
    }
    
    
    
	
}

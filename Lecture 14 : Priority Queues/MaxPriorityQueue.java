// Code : Max Priority Queue
// Send Feedback
// Implement the class for Max Priority Queue which includes following functions -
// 1. getSize -
// Return the size of priority queue i.e. number of elements present in the priority queue.
// 2. isEmpty -
// Check if priority queue is empty or not. Return true or false accordingly.
// 3. insert -
// Given an element, insert that element in the priority queue at the correct position.
// 4. getMax -
// Return the maximum element present in the priority queue without deleting. Return -Infinity if priority queue is empty.
// 5. removeMax -
// Delete and return the maximum element present in the priority queue. Return -Infinity if priority queue is empty.
// Note : main function is given for your reference which we are using internally to test the class.



import java.util.ArrayList;
public class PQ {
	// Complete this class
    private ArrayList<Integer> heap;

	public PQ() {
		heap = new ArrayList<Integer>();
	}

    
    
	boolean isEmpty() {
		// Implement the isEmpty() function here
        return heap.size()==0;
	}

	int getSize() {
		// Implement the getSize() function here
        return heap.size();
	}

	int getMax() {
		// Implement the getMax() function here
        if(isEmpty()) return 0;
        
        return heap.get(0);    
	}

    
    
	void insert(int element) {
		// Implement the insert() function here
        heap.add(element);
        upHeapify();
	}
    
    
    
    

	int removeMax() {
		// Implement the removeMax() function here
        if(isEmpty()) return -1;
        
        int temp=heap.get(0);
        
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        
        downHeapify();
        return temp;    
	}
    
    
    
    
    private void downHeapify(){
        
        int parentIndex=0;
        int leftChildIndex=1;
        int rightChildIndex=2;
        int maxIndex=0;
        
        
        
    while(leftChildIndex<heap.size()){
        
        if(heap.get(leftChildIndex)> heap.get(maxIndex)){
            maxIndex=leftChildIndex;
        }
        
        if(rightChildIndex< heap.size()  && heap.get(rightChildIndex)> heap.get(maxIndex)){
            maxIndex=rightChildIndex;
        }
        
        if(maxIndex!=parentIndex){
            
            int temp=heap.get(maxIndex);
            
            heap.set(maxIndex,heap.get(parentIndex));
            heap.set(parentIndex,temp);
            
            parentIndex=maxIndex;
            leftChildIndex=2*parentIndex+1;
            rightChildIndex=2*parentIndex+2;
        
        }else{
            
            break;
         }   
     }
        
    
 }
    
    
    
    
    

    
     private void upHeapify(){
     
     int childIndex=heap.size()-1;
     
     while(childIndex >0){
         
         int parentIndex=(childIndex-1)/2;
         
         if(heap.get(parentIndex)<heap.get(childIndex)){
             
              int temp=heap.get(childIndex);
         
              heap.set(childIndex,heap.get(parentIndex));
         
              heap.set(parentIndex,temp);
             
             childIndex=parentIndex;
         }
         
         else  return;
       
         }
         
     }
    
    
    
    
        
       
}


  

// Next Number
// Send Feedback
// Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place(i.e. without using extra space).
// Note: You don't need to print the elements, just update the elements and return the head of updated LL.
// Input Constraints:
// 1 <= Length of Linked List <=10^6.
// Input format :
// Line 1 : Linked list elements (separated by space and terminated by -1)
// Output Format :
// Line 1: Updated linked list elements 
// Sample Input 1 :
// 3 9 2 5 -1
// Sample Output 1 :
// 3 9 2 6
// Sample Input 2 :
// 9 9 9 -1
// Sample Output 1 :
// 1 0 0 0 


/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {
    
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
	      LinkedListNode<Integer>current=head;
	      LinkedListNode<Integer>prev=null;
	        
	        while(current!=null){
	            
	            LinkedListNode<Integer>next=current.next;
	            current.next=prev;
	            prev=current;
	            current=next;
	            
	        }
	        
	        return prev;
	        
	    }
	        



		public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
	        
	        head = reverse(head);
	        int carry = 1, num;
	        
	        LinkedListNode<Integer> ptr = head, prev = null;
	        
	        while(ptr != null) {
	        	num = ((ptr.data) + carry) % 10;
	        	carry = ((ptr.data) + carry) / 10;
	        	ptr.data = num;
	        	prev = ptr;
	        	ptr = ptr.next;
	        }
	        
	        if(carry == 1) {
	        	LinkedListNode<Integer> tail = new LinkedListNode<Integer> (carry);
	        	prev.next = tail;
	        	
	        }
	        
	        
	       return reverse(head);
            
        }
            
	   

}

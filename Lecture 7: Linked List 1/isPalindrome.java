// Palindrome LinkedList
// Send Feedback
// You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.
//  Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// First and the only line of each test case or query contains the the elements of the singly linked list separated by a single space.
//  Remember/Consider :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
//  Output format :
// For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.
//  Constraints :
// 1 <= t <= 10^2
// 0 <= M <= 10^5
// Time Limit: 1sec

// Where 'M' is the size of the singly linked list.
// Sample Input 1 :
// 1
// 9 2 3 3 2 9 -1
// Sample Output 1 :
// true
// Sample Input 2 :
// 2
// 0 2 3 2 5 -1
// -1
// Sample Output 2 :
// false
// true
// Explanation for the Sample Input 2 :
// For the first query, it is pretty intuitive that the the given list is not a palindrome, hence the output is 'false'.

// For the second query, the list is empty. An empty list is always a palindrome , hence the output is 'true'.



/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {
    
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
		 if( head == null || head.next == null ) {
             return head;
         }
        
        LinkedListNode<Integer>newHead=reverse(head.next);
        
        head.next.next=head;
        head.next=null;
        
        return newHead;
	}

    
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
        if( head == null || head.next == null ) {
            return true;
        }
		LinkedListNode<Integer> slow = head, fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
        
		LinkedListNode<Integer> head1 = slow.next;
		LinkedListNode<Integer> head2 = head;
		head1 = reverse(head1);
		
		while(head1 != null && head2 != null) {
			if(!head1.data.equals(head2.data)) {
				return false;
			}
			head1 = head1.next;
			head2 = head2.next;
		}
		return true;
         
	}

}

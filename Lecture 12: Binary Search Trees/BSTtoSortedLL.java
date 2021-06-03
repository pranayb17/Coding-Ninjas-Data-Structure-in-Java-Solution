// Code: BST to Sorted LL
// Send Feedback
// Given a BST, convert it into a sorted linked list. You have to return the head of LL.
// Input format:
// The first and only line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.   
// Output Format:
// The first and only line of output prints the elements of sorted linked list.
// Constraints:
// Time Limit: 1 second
// Sample Input 1:
// 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
// Sample Output 1:
// 2 5 6 7 8 10


public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	/*
	 * LinkedList Node Class
	 *
	 * 
	 * class LinkedListNode<T> { T data; LinkedListNode<T> next;
	 * 
	 * public LinkedListNode(T data) { this.data = data; } }
	 */

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        
        if(root == null){
            LinkedListNode<Integer> Node = null;
            return Node;
        }
        
      
		 LinkedListNode<Integer> head  = new LinkedListNode<Integer>(root.data);
        
        if(root.left == null && root.right == null) {
            return head;
        }
        
        
            
        
        else if(root.left !=null && root.right != null)
        {
            LinkedListNode<Integer> temp = constructLinkedList(root.left);
            LinkedListNode<Integer> tempp = temp;
            while(temp.next != null){
                temp=temp.next;
            }

            temp.next = head;
            head.next = constructLinkedList(root.right);
            return tempp;
        }
        
        else if(root.left != null)
        {
            LinkedListNode<Integer> temp = constructLinkedList(root.left);
            LinkedListNode<Integer> tempp = temp;
            
            while(temp.next != null){
                temp = temp.next;
            }
            
            temp.next = head;
            return tempp;
        }
        else
        {
            head.next = constructLinkedList(root.right);
            return head;
        }
        
        
	}
}	

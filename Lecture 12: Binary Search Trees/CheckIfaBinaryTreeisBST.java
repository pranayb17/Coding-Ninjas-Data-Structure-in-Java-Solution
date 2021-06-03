// Check if a Binary Tree is BST
// Send Feedback
// Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree). If yes, return true, return false otherwise.
// Note: Duplicate elements should be kept in the right subtree.
// Input format :
// The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have a left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
// Output format :
// The first and only line of output contains either true or false.
// Constraints :
// Time Limit: 1 second
// Sample Input 1 :
// 3 1 5 -1 2 -1 -1 -1 -1
// Sample Output 1 :
// true
// Sample Input 2 :
// 5 2 10 0 1 -1 15 -1 -1 -1 -1 -1 -1
// Sample Output 2 :
// false


/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

 */

// Time Complexity : O(N)
// Space Cpmplexity : O(H)

// Where N is the number of nodes in input tree and  H is the height of the input tree


public class Solution {
	
	public static boolean isBST(BinaryTreeNode<Integer> root, int min, int max) {
		
		if(root == null){
			return true;
		}
		
		if(root.data > min && root.data <= max){
			boolean  ans1 = isBST(root.left, min, root.data - 1);
			boolean  ans2 = isBST(root.right, root.data, max);
			return ans1 && ans2;
			
		}
		else{
			return false;
		}	
		
	}

		public static boolean isBST(BinaryTreeNode<Integer> root) {
			return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		}
	
}
        
        
           

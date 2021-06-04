// Longest Leaf to root path
// Send Feedback
// Given a binary tree, return the longest path from leaf to root. Longest means, a path which contain maximum number of nodes from leaf to root.
// Input format :

// Elements in level order form (separated by space)

// (If any node does not have left or right child, take -1 in its place)

// Line 1 : Binary Tree 1 (separated by space)

// Sample Input 1 :
//  5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
// Sample Output 1 :
// 9
// 3
// 6
// 5



/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/


import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
        
        if(root == null){
            return null;
        }
		
        if(root.left == null && root.right == null){
            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans.add(root.data);
            return ans;
        }
        
         ArrayList<Integer> leftAns = longestRootToLeafPath(root.left);
         ArrayList<Integer> rightAns = longestRootToLeafPath(root.right);
        
        if(leftAns == null){
            rightAns.add(root.data);
            return rightAns;    
        }
        
        if(rightAns == null){
            leftAns.add(root.data);
            return leftAns;    
        }
        
        if(leftAns.size() > rightAns.size()){
            leftAns.add(root.data);
            return leftAns;
        }else{
             rightAns.add(root.data);
            return rightAns;   
        }
        
       	
	}
	
}

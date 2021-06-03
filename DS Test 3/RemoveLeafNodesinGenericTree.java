// Remove leaf nodes in Tree
// Send Feedback
// Remove all leaf nodes from a given generic Tree. Leaf nodes are those nodes, which don't have any children.
// Note : Root will also be a leaf node if it doesn't have any child. You don't need to print the tree, just remove all leaf nodes and return the updated root.
// Input format :
// Line 1 : Elements in level order form separated by space (as per done in class). Order is - `

// Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element `
// Output Format :
// Elements are printed level wise, each level in new line (separated by space)
// Sample Input 1 :
// 10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output 1 : (Level wise, each level in new line)
// 10
// 20



	/*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/


import java.util.ArrayList;
public class Solution {

	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
		
          if(root == null || root.children.size() == 0){
            return null;
        }

        ArrayList<Integer> indexes = new ArrayList<>();
        for(int i = 0; i < root.children.size(); i++){
            TreeNode<Integer> child = root.children.get(i);
            if(child.children.size() == 0){
                indexes.add(i); 
            }
        }

        for(int i = indexes.size() - 1; i >= 0; i--){
            int j = indexes.get(i);
            root.children.remove(j);
        }

        for(int i = 0; i < root.children.size(); i++){
            TreeNode<Integer> child = removeLeafNodes(root.children.get(i));
            if(child == null){
                root.children.remove(i);
            }
        }

        return root;
    }
        
        
	
}

// Minimum bracket Reversal
// Send Feedback
// For a given expression in the form of a string, find the minimum number of brackets that can be reversed in order to make the expression balanced. The expression will only contain curly brackets.
// If the expression can't be balanced, return -1.
// Example:
// Expression: {{{{
// If we reverse the second and the fourth opening brackets, the whole expression will get balanced. Since we have to reverse two brackets to make the expression balanced, the expected output will be 2.

// Expression: {{{
// In this example, even if we reverse the last opening bracket, we would be left with the first opening bracket and hence will not be able to make the expression balanced and the output will be -1.
// Input Format :
// The first and the only line of input contains a string expression, without any spaces in between.
// Output Format :
// The only line of output will print the number of reversals required to balance the whole expression. Prints -1, otherwise.
// Note:
// You don't have to print anything. It has already been taken care of.
// Constraints:
// 0 <= N <= 10^6
// Where N is the length of the expression.

// Time Limit: 1sec
// Sample Input 1:
// {{{
// Sample Output 1:
// -1
// Sample Input 2:
// {{{{}}
// Sample Output 2:
// 1


import java.util.Stack;

public class Solution {
    

	public static int countBracketReversals(String input) {
	  int len = input.length();
		
		if(len % 2 != 0){  //Only even number of brackets can be balanced
            return -1;
        }

	Stack <Character> stack = new Stack<>();
	
	for(int i = 0; i < len; i++) {
		char currentChar = input.charAt(i);
		
		if(input.charAt(i)=='{') {
			stack.push(currentChar);
		}
		else {
			//pop if there is a balanced pair
			if(!stack.isEmpty() && stack.peek() == '{') {
				stack.pop();	
			}else {
				stack.push(currentChar);
			}  
		}
			
	}
	
	int count = 0;
	
	//Only unbalanced brackets are there in stack now
	while(!stack.isEmpty()) {
		char c1 = stack.pop();
		char c2 = stack.pop();
		
		//when c1 == } and c2 == { , then we need to reverse both of them so count will increase by 2
		if(c1 != c2) {
			count += 2;
		}else {
			count += 1;
		}
			
	}
	
	return count;
	
		
	}
	
}

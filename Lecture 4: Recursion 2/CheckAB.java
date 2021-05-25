// Check AB
// Send Feedback
// Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
// a. The string begins with an 'a'
// b. Each 'a' is followed by nothing or an 'a' or "bb"
// c. Each "bb" is followed by nothing or an 'a'
// If all the rules are followed by the given string, return true otherwise return false.
// Input format :
// String S
// Output format :
// 'true' or 'false'
// Constraints :
// 1 <= |S| <= 1000
// where |S| represents length of string S.
// Sample Input 1 :
// abb
// Sample Output 1 :
// true
// Sample Input 2 :
// abababa
// Sample Output 2 :
// false

public class Solution {

	public static boolean checkAB(String input) {
		
		if(input.length()==0) return true;
			
		
	
        if(input.charAt(0)=='a') {
        	
        	if(input.substring(1).length() >1 && input.subSequence(1, 3).equals("bb")) {
        		
        		 return checkAB(input.substring(3));
        		
        	}
        } 
        
        
        else      return checkAB(input.substring(1));

			
			
		return false;
		
	}
}

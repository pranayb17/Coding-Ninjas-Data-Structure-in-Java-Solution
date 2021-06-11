// Check Palindrome (recursive)
// Send Feedback
// Check whether a given String S is a palindrome using recursion. Return true or false.
// Input Format :
// String S
// Output Format :
// 'true' or 'false'
// Constraints :
// 0 <= |S| <= 1000
// where |S| represents length of string S.
// Sample Input 1 :
// racecar
// Sample Output 1:
// true
// Sample Input 2 :
// ninja
// Sample Output 2:
// false



public class solution {

	public static boolean isStringPalindrome(String input) {
		  
        if(input == null) {
            return false;
        }              
		
	if(input.length() <= 1) {
             return true;
        }  
		
		
        char first = input.charAt(0);
	char last = input.charAt(input.length()-1);
		
	if(first != last) {
            return false;
        }else{
            return isStringPalindrome(input.substring(1,input.length() - 1));
            
        }
          		
    }
	
}

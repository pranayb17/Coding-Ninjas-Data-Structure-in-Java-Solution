// String to Integer
// Send Feedback
// Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
// Input format :
// Numeric string S (string, Eg. "1234")
// Output format :
// Corresponding integer N (int, Eg. 1234)
// Constraints :
// 0 <= |S| <= 9
// where |S| represents length of string S.
// Sample Input 1 :
// 00001231
// Sample Output 1 :
// 1231
// Sample Input 2 :
// 12567
// Sample Output 2 :
// 12567




import java.lang.*;

public class solution {

	public static int convertStringToInt(String input){
    
	        int len = input.length();
	       
	        if (len == 1){
	            //return input.charAt(0) - '0';
                    return Character.getNumericValue(input.charAt(0));
	        }
	        
	
	        int smallOutput = convertStringToInt(input.substring(0, len - 1));
                // int lastDigit = input.charAt(len-1) - '0';
	        int lastDigit = Character.getNumericValue(input.charAt(len-1));
        
	        return smallOutput *10 + lastDigit;
	        

	}
}


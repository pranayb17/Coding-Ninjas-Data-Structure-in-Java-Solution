// Replace pi (recursive)
// Send Feedback
// Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
// Sample Input 1 :
// xpix
// Sample Output :
// x3.14x
// Sample Input 2 :
// pipi
// Sample Output :
// 3.143.14
// Sample Input 3 :
// pip
// Sample Output :
// 3.14p

public class solution {

	// Return the changed string
	public static String replace(String input){
		
        int len=input.length();
		
		    if (len<2)      
                
                return input;                                                // if len is 1 return
	           
	        
		    if(input.startsWith("pi"))
		    	
		    	  return "3.14" + replace(input.substring(2,len));
        
        
        else {                                                              
	        return  input.charAt(0)+ replace(input.substring(1,len));          // Divide string into zero and remaining
	        }
	}
}

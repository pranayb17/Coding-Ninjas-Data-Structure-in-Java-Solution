// Return Keypad Code
// Send Feedback
// Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
// Return empty string for numbers 0 and 1.
// Note : 1. The order of strings are not important.
// 2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
// Input Format :
// Integer n
// Output Format :
// All possible strings in different lines
// Constraints :
// 1 <= n <= 10^6
// Sample Input:
// 23
// Sample Output:
// ad
// ae
// af
// bd
// be
// bf
// cd
// ce
// cf

public class solution {

	public static String[] keypad(int n){
		
        if (n==0){
            String ans[] = {""};
           
            return ans;
        }
        
        
        String[] smallAns = keypad(n/10);
        
        String[] options = keymap(n%10);
        
        
        String ans[] = new String[smallAns.length * options.length];
        
        int k = 0;
        for (int i = 0; i<smallAns.length;i++){
            
            for(int j = 0; j<options.length; j++){
                ans[k] = smallAns[i] + options[j];
                k++;
            }
        }
        
        return ans;

	}
    
	
	 private static String[] keymap(int n){
		 
		 
	        if (n==0 || n==1){
	            String ans[] = {""};
	            return ans;
	        }
	        
	        else if (n==2){
	            String ans[] = {"a","b","c"};
	            return ans;
	        }
	        
	        else if (n==3){
	            String ans[] = {"d","e","f"};
	            return ans;
	        }
	        
	        else if(n==4){
	            String ans[] = {"g","h","i"};
	            return ans;
	        }
	        
	        else if(n==5){
	            String ans[] = {"j","k","l"};
	            return ans;
	        }
	        
	        else if(n==6){
	            String ans[] = {"m","n","o"};
	            return ans;
	        }
	        
	        else if(n==7){
	            String ans[] = {"p","q","r","s"};
	            return ans;
	        }
	        
	        else if(n==8){
	            String ans[] = {"t","u","v"};
	            return ans;
	        }
	        
	        else if(n==9){
	            String ans[] = {"w","x","y","z"};
	            return ans;
	        } 
	        return null;
	    }
	 
	 
}



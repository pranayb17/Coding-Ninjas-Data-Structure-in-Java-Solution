package Lec6_OOPS3_Generics;

public class Print {
	 /*generic methods*/
	
	public static<T> void printArray(T a[]) {  /*we have to include <T> before return type of the function in 
	                                            function signature        */
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			//System.out.print(" ");
			
		}
		System.out.println();
	}
         /* NOTE*/
	public static void main(String[] args) {
		Integer a[]=new Integer[10];
		for(int i=0;i<10;i++) {
			a[i]=i+1;
		}
		
		printArray(a);
		
		String s[]=new String[10];
		for(int i=0;i<10;i++) {
			s[i]="AB";
		}
		
		printArray(s);
		
	}

}

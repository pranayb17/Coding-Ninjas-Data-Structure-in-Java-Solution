package Lec6_OOPS3_Generics;

public class pair1use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pair1<String,String> p= new pair1<String,String>("ab","cd");
		
		
		
		pair1<Integer,String> p1= new pair1<Integer,String>(1,"Temp");
		
		
		pair1<Character,Character> p3= new pair1<>('A','B');   /*we dont need to specify on the right side also*/
		
		
		

            /*_________________creating the triplet class__________________*/
		
		int a=10;
		int b=20;
		int c=30;
		
		pair1<Integer,Integer> internalPair= new pair1<>(a,b);
		
		pair1<pair1<Integer,Integer>  ,Integer> p4= new pair1<>(internalPair,c);  /*taking internal pair as first argument & c as second*/
		
		System.out.println(p4.getSecond());     //for getting third element
		
		
		System.out.println(p4.getFirst().getFirst());     /*for getting  first pair ____p4.getFirst()
		                                                  .getFirst()_____  for getting first element in the pair*/
   
		System.out.println(p4.getFirst().getSecond());
	}

}

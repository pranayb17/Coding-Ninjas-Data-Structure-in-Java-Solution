package Lec6_OOPS3_Generics;

public class PairUse {
	
	/* Generic class is a class which is able to store multiple data types*/
    /*only non primitive data type is allowed */
	public static void main(String[] args) {
		
		Pair<String> p= new Pair<String>("ab","cd");
		p.setFirst("def");
		p.getFirst();
		
		String s =p.getFirst();  //storing in the string
		
		System.out.println(s);
		
		
		Pair p1= new Pair(1,2);
		p1.setFirst("abc");                //we cant create the object of primitive data type
		
		Pair<Integer> p2= new Pair<Integer>(1,2);
		
        Pair<Character>p3=new Pair('a','b');        //in newer version of java we don't need to specify class both the sides
		
		
		/*  Pair p= new Pair(1,2);
		    p.setFirst(10);
		    System.out.println(p.getFirst());
		    System.out.println(p.getSecond());    */

		

	}

}

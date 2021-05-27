package Lec6_OOPS3_Generics;

public class Pair<T> {     /*generic syntax{ <T> } should be after class name*/
	
	private T first;       /*at the place of T we can only use non primitive data types */
	private T second;
	
	public Pair(T first,T second) {
		this.first=first;
		this.second=second;
		
	}
	
	
	public T getFirst() {
		return first;
	}
	
	
	public void setFirst(T first) {
		this.first=first;
	}
	
	public T getSecond() {
		return second;
	}
	
	
	public void setSecond(T second) {
		this.second=second;
	}

	

}

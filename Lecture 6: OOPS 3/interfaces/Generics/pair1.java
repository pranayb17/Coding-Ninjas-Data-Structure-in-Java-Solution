package Lec6_OOPS3_Generics;

public class pair1<T,V> {
	
	private T first;       /*at the place of T & V we can only use non primitive data types */
	private V second;
	
	public pair1(T first,V second) {
		this.first=first;
		this.second=second;
		
	}
	
	
	public T getFirst() {
		return first;
	}
	
	
	public void setFirst(T first) {
		this.first=first;
	}
	
	public V getSecond() {
		return second;
	}
	
	
	public void setSecond(V second) {
		this.second=second;
	}

	

}



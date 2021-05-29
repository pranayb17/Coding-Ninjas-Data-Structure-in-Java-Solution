
public class StackUsingArray {
	
	private int data[];
	private int top;                                              // is the index of topmost element of stack
	
	public StackUsingArray() {
		data = new int[10];                                   // if size is not mentioned in constructor --default size is 10
		top = -1;
	}
	
	public StackUsingArray(int capacity) {                        // user input size for the stacks --in constructor
		data = new int[capacity];
		top = -1;
	}
	
	public  boolean isEmpty(){                                   // the function is belongs to different stacks i.e it is not static
//		if(top == -1){
//			return true;
//		}else{
//			return false;
//		}
		return (top == -1);
	}
	
	public int size(){                                          // no .of elements in stacks
		return top + 1;	
		}
	
	public int top() throws StackEmptyException{
		if(size() == 0){
			//StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}
	
	public void push(int elem) throws StackFullException{
		if(size() == data.length){
			// Stack Full
			StackFullException e = new StackFullException();
			throw e;			
		}
		top++;
		data[top] = elem;
	}

	public int pop() throws StackEmptyException{
		if(size() == 0){
			//StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
		
	}
}

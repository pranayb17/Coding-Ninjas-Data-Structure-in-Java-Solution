import java.util.LinkedList;

public class collectionsLinkedList {
  
  public static void main(String[] args){
    
    LinkedList<Integer> list = new LinkedList<>();  //by default doubly linked list
    
    list.add(10);
    list.add(20);
    list.addFirst(40);
    list.addFirst(70);
    list.set(2, 100);
    
    
    System.out.println(list.size());
    
    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i) + " ");
    }
    
  }
  
}

package week5;

public class Node0  <E extends Comparable<E>>{
	private E    item;
	private Node0 next;
	
	public Node0(E newItem, Node0<E> p){ // 생성자
		item  = newItem;
		next  = p;
	}
	// get 메소드와 set 메소드
	public E    getItem() { return item;}
    public Node0 getNext() { return next;}
    public void setItem(E newItem)  { item = newItem;}
    public void setNext(Node0 n) 	{ next = n;}
}s
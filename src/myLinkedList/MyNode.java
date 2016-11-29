package myLinkedList;

public class MyNode {
	private Object data;
	private MyNode next;
	
	public MyNode(Object o){
		data = o;
	}
	
	public MyNode(Object o,MyNode n){
		data = o;
		next = n;
	}
	
	public void setData(Object d){
		data = d;
	}
	
	public Object getData(){
		return data;
	}
	
	public MyNode getNode(){
		return next;
	}
	
	public void setNext(MyNode n){
		next = n;
	}
	public MyNode getNext(){
		return next;
	}
}

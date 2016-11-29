package myLinkedList;


public class myLinkedList {
	private int counter;
	private MyNode head;
	
	
	public myLinkedList(){
		
	}
	public void add(Object o){
		if(head==null){
			head = new MyNode(o);
			incrementCounter();
		}
		
		MyNode nodeTemp = new MyNode(o);
		MyNode nodeCurrentNode = head;
		
		if(nodeCurrentNode!=null){
			while(nodeCurrentNode.getNext()!=null){
				nodeCurrentNode = nodeCurrentNode.getNext();
			}
			nodeCurrentNode.setNext(nodeTemp);
			incrementCounter();
		}
	}
	
	private int getCounter(){
		return counter;
	}
	
	private void incrementCounter(){
		counter++;
	}
	
	private void decrementCounter(){
		counter--;
	}
	
	public int size(){
		return getCounter();
	}
	
	public void add(int index, Object o){
		if(index < 1 || index > size()){
			//throw new IndexOutOfBoundsException;
		}
		
		MyNode tempdata = new MyNode(o);
		MyNode currentNode = new MyNode(o);
		if(currentNode!= null){
			for(int x=0; x<index;x++){
				currentNode=currentNode.getNext();
			}
		}
		tempdata.setNext(currentNode.getNext());
		currentNode.setNext(tempdata);
		incrementCounter();
	}
}

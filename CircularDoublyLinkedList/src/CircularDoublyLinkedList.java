public class CircularDoublyLinkedList {
	private Node head;
	private Node dlList;
	private int count;
	//counts the number of nodes in the list
	CircularDoublyLinkedList(){
		count = 0;
	}
	
	public void print(){
		if(count==0){
			System.out.println("Empty List.");
			return;
		}
		Node current=head;
		do{
			System.out.println(current.value);
			current=current.next;
		}while(current!=head);
	}
	
	public void addNode(int value){
		Node newNode=new Node(value);
		
		if(count==0){
			dlList=newNode;
			dlList.next=dlList;
			dlList.prev=dlList;
			head=dlList;
		}else{
			newNode.prev=dlList.prev;
			newNode.next=dlList;
			dlList.prev.next=newNode;
			dlList.prev=newNode;
			head=dlList;
		}
		count++;
	}
	private class Node{
		Node next;
		Node prev;
		int value;
		
		Node(int value){
			this.value=value;
		}
		
		
	}
}

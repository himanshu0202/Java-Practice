public class DoublyLinkedList {
	private Link head;
	private int size;
	
	public DoublyLinkedList(){
		head=null;
		size=0;
	}
	
	//How to add a node in front
	
	public void addFront(int data){
		if(head==null){
			head=new Link(null,data,null);
		}else{
			Link newLink=new Link(null,data,head);//For this new node head is the next node that is at the front of the linked list
			head.previous=newLink;
			head=newLink;
		}
		size++;
	}
	
	public void addRear(int data){
		if(head==null){
			head=new Link(null,data,null);
		}else{
			Link current=head;
			while(current.next!=null){
				current=current.next;
			}
			Link newLink=new Link(current,data,null);
			current.next=newLink;
		}
		size++;
	}
	
	public void removeFront(){
		if (head==null) return;
		head=head.next;
		head.previous=null;
		size--;
	}
	
	public void removeRear(){
		if (head==null) return;
		Link current=head;
		while(current.next!=null){
			current=current.next;
		}
		current=current.previous;
		current.next=null;
		size--;
	}
	
	public void insertAt(int data,int index){
		if(head==null) return;
		if(index< 1 || index > size) return;
		Link current=head;
		int i=1;
		while(i<index){
			current=current.next;
			i++;
		}
		if(current.previous==null){
			Link newLink=new Link(null,data,current);
			current.previous=newLink;
			head=newLink;
		}else{
			Link newLink=new Link(current.previous,data,current);
			current.previous.next=newLink;
			current.previous=newLink;
		}
		size++;
		
	}
	
	public void removeAt(int index){
		if(head==null) return;
		if(index<1 || index>size) return;
		Link current=head;
		int i=1;
		while(i<index){
			current=current.next;
			i++;
		}
		if(current.next==null){
			current.previous.next=null;
		}else if(current.previous == null){
			current=current.next;
			current.previous=null;
			head=current;
		}else{
			current.previous.next=current.next;
			current.next.previous=current.previous;
		}
		size--; 
	}
	
	public int size(){
		return size;
	}
	
	public void print(){
		Link current =head;
		while (current!=null){
			System.out.println(current.Data());
			current=current.next;
			
		}
	}
	public boolean isEmpty(){
		return(head==null);
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.addFront(5);
		dll.addFront(10);
		dll.addFront(40);
		dll.print();
		System.out.println("--------------------------");
		dll.addRear(20);
		dll.addRear(60);
		dll.print();
		System.out.println("--------------------------");
		dll.removeFront();
		dll.print();
		System.out.println("--------------------------");
		dll.removeRear();
		dll.print();
		
	}

}

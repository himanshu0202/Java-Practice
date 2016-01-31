public class LinkedList {
	private Link head;
	
	public LinkedList(){
		head=null;
	}
	
	public boolean isEmpty(){
		return (head==null);
	}
	
	public void insert(int data){
		Link newLink=new Link(data);
		newLink.next=head;
		head=newLink;
	}
	
	public boolean delete(){
		if (isEmpty()) return false;
		head = head.next;
		return true;
	}
	
	public void print(){
		Link current=head;
		while(current!=null){
			System.out.println(current.Data());
			current=current.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList LinkedList=new LinkedList();
		LinkedList.insert(17);
		LinkedList.insert(22);
		LinkedList.print();
		LinkedList.delete();
		LinkedList.print();

	}

}

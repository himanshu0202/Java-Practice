package himanshu;

public class Link {
	public String bookName;
	public int millionsSold; 
	public Link next;
	
	public Link(String bookName,int millionsSold){
		this.bookName=bookName;
		this.millionsSold=millionsSold;
	}
	
	public void display(){
		System.out.println(bookName + ": " + millionsSold + ",000,000");
	}
	
	public String toString(){
		return bookName;
	}
	
	
	public static void main(String[] args){
		LinkedList theLinkedList = new LinkedList();
		theLinkedList.insertFirstLink("Don Quixote", 500);
		theLinkedList.insertFirstLink("Thousand Splendid Suns", 800);
		/*theLinkedList.insertFirstLink("Kite Runner", 1000);
		theLinkedList.insertFirstLink("Entourage", 1500);*/
		
		
		theLinkedList.display();
		theLinkedList.firstLink = theLinkedList.Delete(theLinkedList.firstLink, 1);
		
		//theLinkedList=theLinkedList.reverseList(theLinkedList);
		theLinkedList.display();
	}
	
}

class LinkedList{
	public Link firstLink;
	
	LinkedList(){
		firstLink = null;
	}
	
	public boolean isEmpty(){
		
		return(firstLink==null);
	}
	
	public void insertFirstLink(String bookName, int millionsSold){
		Link newLink = new Link(bookName,millionsSold);
		newLink.next=firstLink;
		firstLink=newLink;
	}
	
	public Link removeLink(){
		Link linkReference = firstLink;
		if (!isEmpty()){
			firstLink=firstLink.next;
		}else{
			System.out.println("Empty Linked List");
		}
		
		return linkReference;
	}
	
	public void display(){
		Link theLink= firstLink;
		
		while(theLink != null){
			
			theLink.display();
			System.out.println("Next Link:" + theLink.next);
			theLink=theLink.next;
		}
		
	}
	
	public Link find(String bookName){
		Link theLink = firstLink;
		
		if (!isEmpty()){
			while(theLink.bookName != bookName){
				if(theLink.next ==null){
					 return null;
				}else{
					theLink = theLink.next;
				}
			}
			
		}else{
			System.out.println("Empty Linked List");
		}
		
		return theLink;
	}
	
	public Link removeLink(String bookName){
		Link currentLink = firstLink;
		Link previousLink = firstLink;
		
		while(currentLink.bookName != bookName){
			if (currentLink.next == null){
				return null;
			}else{
				previousLink = currentLink;
				currentLink = currentLink.next;
			}
		}
		
		if (currentLink==firstLink){
			firstLink = firstLink.next;
		}else{
			previousLink.next=currentLink.next;
		}
		
		return currentLink;
	}
	
	public LinkedList reverseList(LinkedList theLink){
		if((firstLink==null) || (firstLink.next==null)){
			return theLink;
		}
		
		Link prevNode,currNode,nextNode;
		prevNode=null;
		nextNode=null;
		currNode=firstLink;
		while(currNode.next!=null){
			nextNode=currNode.next;
			currNode.next=prevNode;
			prevNode=currNode;
			currNode=nextNode;
		}
		currNode.next=prevNode;
		firstLink=currNode;
		return theLink;
	}
	
	public Link Delete(Link firstLink, int position) {
		  // Complete this method
		    if(firstLink == null){
		        return null;
		    }
		    int counter = 0;
		    Link currNode = firstLink;
		    Link prevNode = null;
		    while (counter < position){
		        if(currNode.next == null){
		            return null;
		        }
		        counter = counter + 1;
		        prevNode = currNode;
		        currNode = currNode.next;
		    }
		    if(counter == 0){
		        return firstLink.next;
		    }
		    prevNode.next = currNode.next;
		    
		    return firstLink;
		}
}

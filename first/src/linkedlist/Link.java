package linkedlist;

public class Link{
	public String bookName;
	public int millionsSold;
	public Link next;
	
	public Link(String bookName,int millionsSold){
		this.bookName=bookName;
		this.millionsSold=millionsSold;
	}
	
	public void display(){
		System.out.println("Book with name" + " " + bookName + " has " + millionsSold + ",000,000 copies sold");
	}
	
	public String toString(){
		return bookName;
	}
	
	public static void main(String[] args){
		linkedList theLinkedList=new linkedList();
		/*theLinkedList.insertFirstLink("A Thousand Splendid Suns",500);
		theLinkedList.insertFirstLink("Harry Porter",700);
		theLinkedList.insertFirstLink("A Kite Runner",800);*/
		theLinkedList.insertFirstLink("Harry Porter",700);
		theLinkedList.insertFirstLink("Harry Porter",700);
		theLinkedList.insertFirstLink("A Kite Runner",800);
		theLinkedList.insertFirstLink("A Kite Runner",800);
		theLinkedList.insertFirstLink("A Kite Runner",800);
		theLinkedList.insertFirstLink("A Kite Runner",800);
		theLinkedList.insertFirstLink("Harry Porter",700);
		theLinkedList.display();
		/*theLinkedList.firstLink=theLinkedList.deleteDuplicates(theLinkedList.firstLink);
		theLinkedList.firstLink=theLinkedList.removeElements(theLinkedList.firstLink, "Harry Porter");
		theLinkedList.display();
		theLinkedList.firstLink=theLinkedList.iterativeReverse(theLinkedList.firstLink);
		theLinkedList.display();
		theLinkedList.firstLink=theLinkedList.removeNthFromEnd(theLinkedList.firstLink, 2);
		theLinkedList.display();*/
		boolean result = theLinkedList.isPalindrome(theLinkedList.firstLink);
		if (result == true){		
			System.out.println("String is a palindrome");
		}else{
			System.out.println("String is not a palindrome");
		}
	}

}

class linkedList{
	
	public Link firstLink;
	
	public linkedList(){
		firstLink=null;
	}
	
	public boolean isEmpty(){
		return(firstLink==null);
	}
	
	public void insertFirstLink(String bookName,int millionsSold){
		Link newLink=new Link(bookName,millionsSold);
		newLink.next=firstLink;
		firstLink=newLink;
	}
	
	public Link removeFirstLink(){
		Link theLink=firstLink;
		if(!isEmpty()){
			firstLink=firstLink.next;
		}
		else{
			System.out.println("Empty Linked List");
		}
		return theLink;
	}
	
	public void display(){
		Link theLink=firstLink;
		while(theLink!=null){
			theLink.display();
			System.out.println("Next Link:"+ theLink.next);
			theLink=theLink.next;
		}
	}
	
	public Link find(String bookName){
		Link theLink=firstLink;
		if(!isEmpty()){
			while(theLink.bookName!=bookName){
				if(theLink.next==null){
					return null;
				}
				else{
					theLink=theLink.next;
				}
			}
		}
		else{
			System.out.println("Empty Linked List");
		}
		return theLink;
	}
	
	public Link removeLink(String bookName){
		Link currentLink=firstLink;
		Link previousLink=firstLink;
		
		while(currentLink.bookName!=bookName){
			if(currentLink.next==null){
				return null;
			}
			else{
				previousLink=currentLink;
				currentLink=currentLink.next;
			}
		}
		if(currentLink==firstLink){
			firstLink=firstLink.next;
		}
		else{
			previousLink.next=currentLink.next;
		}
		return currentLink;
	}
	
	public Link iterativeReverse(Link firstLink) {
		 
        if (firstLink==null || (firstLink.next == null)) {
          return firstLink;
        }
 
        Link prevNode, currNode, nextNode;
        prevNode = null;
        nextNode = null;
        currNode = firstLink;
 
        while (currNode.next != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        currNode.next=prevNode;
        firstLink=currNode;
        return firstLink;
        
    }
	
	public Link removeNthFromEnd(Link firstLink, int n) {
        if (firstLink==null){
            return firstLink;
        }
        int size=0;
        Link currNode=firstLink;
        while(currNode.next!=null){
            size=size+1;
            currNode=currNode.next;
        }
        size=size+1;
        Link newLink=firstLink;
        Link prevLink=null;
        int count=1;
        while(count < (size-n+1)){
            prevLink=newLink;
            newLink=newLink.next;
            count=count+1;
        }
        if(newLink==firstLink){
            firstLink=newLink.next;
            return firstLink;
        }else if(newLink.next==null){
            prevLink.next=null;
            return firstLink;
        }else{
            prevLink.next=newLink.next;
            return firstLink;
        }
    }
	
	public Link removeElements(Link firstLink, String bookName) {
        if(firstLink==null){
        	return firstLink;
        }
        Link currLink=firstLink;
        Link prevLink=null;
        if(currLink.next==null && currLink.bookName==bookName){
        	firstLink=null;
        	return firstLink;
        }else if(currLink.next==null){
            return firstLink;
        }
        while(currLink.next!=null){
        	if(currLink.bookName==bookName){
        		if(currLink==firstLink){
        			firstLink=currLink.next;
        			currLink=firstLink;
        		}else{
        			prevLink.next=currLink.next;
        			currLink=currLink.next;
        		}
        	}else{
        		prevLink=currLink;
        		currLink=currLink.next;
        	}
        }
        if(currLink==firstLink){
            if(currLink.bookName==bookName){
            	firstLink=null;
            	return firstLink;
            }else{
                return firstLink;
            }
        }else{
        	if(currLink.bookName==bookName){
        		prevLink.next=null;
        		return firstLink;
        	}
        }
        return firstLink;
    }
	
	public Link deleteDuplicates(Link firstLink) {
        if(firstLink==null){
            return firstLink;
        }
        Link currLink=firstLink;
        while(currLink.next!=null){
            do{
                if(currLink.bookName==currLink.next.bookName){
                    if(currLink.next.next==null){
                        currLink.next=null;
                        return firstLink;
                    }else{
                        currLink.next=currLink.next.next;
                    }
                }
            }while(currLink.bookName==currLink.next.bookName);
            currLink=currLink.next;
        }
        return firstLink;
    }
	
	public boolean isPalindrome(Link firstLink){
		if(firstLink==null){
			return true;
		}
		// a->b->c->b->a 
	    // fast move to find the mid 'c' in singly linked list 
		Link mid = findMid(firstLink);
		
		// a->b->c<-b<-a
	    // change the next for the half of them 
		Link back = iterativeReverse(mid);
		
		// unlink the two lists 
		mid.next = null;
		
		// compare if these are same letter or one letter left
		return isPalindrome(firstLink, back);
		
		
	}
	
	private Link findMid(Link firstLink){
		Link slow = firstLink;
		Link fast = firstLink;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	private boolean isPalindrome(Link head,Link back){
		while(head!=null && back!=null){
			if(head.bookName != back.bookName){
				return false;
			}
			
			head = head.next;
			back = back.next;
		}
		
		if(head == null && back == null){
			return true;
		}
		if(head != null && head.next == null){
			return true;
		}
		return false;
	}
}

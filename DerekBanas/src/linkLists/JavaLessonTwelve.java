package linkLists;
import java.util.Arrays;
import java.util.LinkedList;
public class JavaLessonTwelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedListOne = new LinkedList();
		LinkedList<String> names = new LinkedList<String>();
		names.add("Ahmed Bennani");
		names.add("Ali Syed");
		
		names.addLast("Kurt Kobain");
		names.addFirst("Hussain");
		names.add(1, "Himanshu");
		names.set(1, "Anand");
		names.remove(1);
		
		for(String name:names){
			System.out.println(name);
		}
		
		System.out.println();
		System.out.println(names.get(1));
		
		System.out.println(names.getLast());
		
		LinkedList<String> newCopy = new LinkedList<String>();
		newCopy.addAll(names);
		for(String name:newCopy){
			System.out.println(name);
		}
		System.out.println("Remove First Element " + names.poll());
		
		System.out.println("Remove First Element " + names.pollLast());
		names.clear();
		if(names.peek() == null){
			System.out.println("list is empty");
		}
		names.push("Anand");
		
		System.out.println(names.toString());
		
		names.pop();
		System.out.println(names.toString());
		
		Object[] newArray = new Object[4];
		newArray = newCopy.toArray();
		for(Object printNames:newArray){
			System.out.println(printNames);
		}
		System.out.println();
		System.out.print(Arrays.toString(newArray));
	}

}

import java.util.Arrays;

public class TheStack {
	private static String[] stackArray;
	
	private int stackSize;//size of the array
	
	private int topOfStack =-1;//stack is empty
	
	TheStack(int size){
		stackSize = size;
		stackArray = new String[stackSize];
		Arrays.fill(stackArray, "-1");
		
	}
	
	public void push(String input){
		if(topOfStack < stackSize -1){
			topOfStack++;
			stackArray[topOfStack] = input;
		}else{
			System.out.println("Stack is full");
		}
	}
	
	public String pop(){
		if(topOfStack >= 0){
			stackArray[topOfStack] = "-1";
			return stackArray[topOfStack--];
		}else{
			return "-1";
		}
	}
	
	public String peek(){
		return stackArray[topOfStack];
	}
	
	public void pushMany(String multipleValues){
		String[] tempString = multipleValues.split(" ");
		for(int i=0;i<tempString.length;i++){
			push(tempString[i]);
		}
	}
	
	public void popAll(){
		for(int i=topOfStack;i>=0;i++){
			pop();
		}
	}
	
	public void popDisplayAll(){
		String reverseString = "";
		for(int i=topOfStack;i>=0;i++){
			reverseString +=stackArray[topOfStack];
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheStack theStack= new TheStack(10);
		theStack.push("10");
		theStack.push("15");
		theStack.displayTheStack();
		theStack.peek();
		theStack.pop();
		theStack.displayTheStack();
		theStack.peek();
		theStack.pushMany("12 13 14 15");
		theStack.displayTheStack();
		theStack.popAll();
		theStack.popDisplayAll();
		theStack.displayTheStack();
	}
	
	public void displayTheStack(){
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < stackSize; n++){
			
			System.out.format("| %2s "+ " ", n);
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < stackSize; n++){
			
			
			
			if(stackArray[n].equals("-1")) System.out.print("|     ");
			
			else System.out.print(String.format("| %2s "+ " ", stackArray[n]));
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
	
}
}

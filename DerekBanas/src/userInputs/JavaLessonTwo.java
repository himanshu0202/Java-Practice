package userInputs;
import java.util.Scanner;
public class JavaLessonTwo{
	static Scanner userInput = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Your favourite number: ");
		if(userInput.hasNextInt()){
			//if the input given by the user is an Int
			int numberEntered = userInput.nextInt();
		}
		else{
		System.out.println("Enter an integer next time");
		}
	}
	
}
import java.io.*;
public class Writer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			boolean newFile =false;
			File file = new File("fileWrite1.doc");
			System.out.println(file.exists());
			newFile = file.createNewFile();
			System.out.println(newFile);
			System.out.println(file.exists());
		}catch(IOException e){
			
		}
		
	}

}

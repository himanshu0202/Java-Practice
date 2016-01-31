import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;
public class SerializaDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collar c= new Collar(3);
		Dog d = new Dog(c,5);
		System.out.println("before: collar size is " + d.getCollar().getCollarSize());
		try{
			FileOutputStream fs = new FileOutputStream("testSeri.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
		}catch(IOException ex){
			ex.printStackTrace();
		}
		try{
			FileInputStream fis =new FileInputStream("testSeri.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d= (Dog) ois.readObject();
			ois.close();
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		System.out.println("After: collar size is " + d.getCollar().getCollarSize());
	}

}

class Dog implements Serializable{
	transient private Collar theCollar;
	private int dogSize;
	public Dog(Collar collar, int size){
		theCollar = collar;
		dogSize = size;
	}
	public Collar getCollar(){
		return theCollar;
	}
	private void writeObject (ObjectOutputStream os){
		try{
			os.defaultWriteObject();
			os.writeInt(theCollar.getCollarSize());
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	private void readObject (ObjectInputStream is){
		try{
			is.defaultReadObject();
			theCollar = new Collar(is.readInt());
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}

class Collar{
	private int collarSize;
	public Collar(int size){
		collarSize = size;
	}
	
	public int getCollarSize(){return collarSize;} 
}

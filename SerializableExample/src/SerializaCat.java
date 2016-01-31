import java.io.*;

class Cat implements Serializable{}

public class SerializaCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		try{
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(c);
			os.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			FileInputStream fis =new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			c = (Cat) ois.readObject();
			ois.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

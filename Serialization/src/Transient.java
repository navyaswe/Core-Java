import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Vehicle implements Serializable{
	
	int i = 10;
	transient int j = 20;
	//static transient int j = 20; 
	//final transient int j = 20;
	
}
public class Transient {

	public static void main(String[] args)throws Exception{
		Vehicle v = new Vehicle();
		System.out.println("Serialization started");
		String file = "text.ser";
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(v);
		
		System.out.println("Seriallization object reference:" +v);
		System.out.println("Serialization ends");
		
		System.out.println("De-Serialization started");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ios = new ObjectInputStream(fis);
		
		Vehicle v1 = (Vehicle)ios.readObject();
		
		System.out.println("Object data");
		System.out.println(v1.i+" "+v1.j);
		
		
	}

}
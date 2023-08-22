import java.io.*;

class Vehicle implements Serializable{
	static {
		System.out.println("Static Block");
	}
	Vehicle(){
		System.out.println("Constructor/Object creation");
	}
	int i = 10, j = 20;
	
}
public class VehicleClass {

	public static void main(String[] args)throws Exception{
		Vehicle v = new Vehicle();
		System.out.println("Serialization started");
		String file = "sample.ser";
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(v);
		
		System.out.println("Seriallization object reference:" +v);
		System.out.println("Serialization ends");
		
		System.out.println("De-Serialization started");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ios = new ObjectInputStream(fis);
		Object obj = ios.readObject();
		Vehicle v1 = (Vehicle)obj;
		
		System.out.println("De-Seriallization object reference:" +v1);
		System.out.println("De-Serialization ends");
		
		
		
		

	}

}

import java.io.*;

class Test implements Externalizable{
	String a;
	int i,j;
	Test(String a, int i, int j){
		this.a = a;
		this.i = i;
		this.j = j;
	}
	Test(){
		System.out.println("No args constructor");
		
	}
	//Serialization
	public void writeExternal(ObjectOutput out)throws IOException{
		System.out.println("call back method during serialization");
		out.writeObject(a);
		out.writeInt(i);
	}
	//De-Serialization
	public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException{
		System.out.println("call back method during de-serialization");
		a = (String)in.readObject();
		j = in.readInt();
	}
}
public class ExternalClass {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
		Test t = new Test("aaaa",10,20);
		System.out.println("Serialization started");
		
		String file = "text.ser";
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(t);
		System.out.println("Serialization ends");
		
		System.out.println("De-Serialization started");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ios = new ObjectInputStream(fis);
		Object obj = ios.readObject();
		t = (Test)ios.readObject();
		
		System.out.println(t.a+" "+t.i+" "+t.j);
		System.out.println("De-Serialization ends");
		

	}

}

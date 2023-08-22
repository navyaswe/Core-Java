import java.util.*;
import java.util.Iterator;

class Student1{
	String name;
	int age;
	
	public Student1(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return "";
	}
}
public class HashMapClass {

	public static void main(String[] args) {
		Student1 s = new Student1("Alice",19);
		Student1 s1 = new Student1("Bob",20);
		HashMap hm = new HashMap();
		hm.put(1, s);
		hm.put(2, s1);
		
		Collection cl = hm.values();
		Iterator itr = cl.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		while(itr.hasNext()) {
			String str=(String)itr.next();
			System.out.println(s); // returns values
			System.out.println(itr.next());
		}
		
		
		while(itr.hasNext()) {
			Integer i=(Integer)itr.next();
			System.out.println(i); // returns keys
			System.out.println(itr.next());
		}
	}

}

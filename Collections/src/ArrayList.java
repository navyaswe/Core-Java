import java.util.*;

class Student{
	String name;
	int age;
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class ArrayList {

	public static void main(String[] args) {
		Student s = new Student("Alice",19);
		Student s1 = new Student("Bob",20);
		ArrayList arl = new ArrayList();
		((Object) arl).add(s1);
		((Object) arl).add(s); 
		Collections.sort(arl); // sort method not works on complex objects
		System.out.println(arl);
		
		

	}

}
